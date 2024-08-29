package bajaj.bajaj_app;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5GeneratorApp {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: java -jar test.jar <prn_number> <path_to_json_file>");
			return;
		}

		String prnNumber = args[0].toLowerCase().trim();
		String jsonFilePath = args[1];

		try {
			String destinationValue = findDestinationValue(jsonFilePath);
			String randomString = generateRandomString(8);
			String hash = generateMD5Hash(prnNumber, destinationValue, randomString);

			System.out.println(hash + ";" + randomString);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}

	private static String findDestinationValue(String jsonFilePath) throws IOException {
		ObjectMapper objectMapper = new ObjectMapper();
		JsonNode rootNode = objectMapper.readTree(new File(jsonFilePath));
		return findDestination(rootNode);
	}

	private static String findDestination(JsonNode node) {
		if (node.has("destination")) {
			return node.get("destination").asText();
		}
		for (JsonNode child : node) {
			String value = findDestination(child);
			if (value != null) {
				return value;
			}
		}
		return null;
	}

	private static String generateRandomString(int length) {
		SecureRandom random = new SecureRandom();
		StringBuilder sb = new StringBuilder(length);
		String ALPHANUMERIC_CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

		for (int i = 0; i < length; i++) {
			sb.append(ALPHANUMERIC_CHARACTERS.charAt(random.nextInt(ALPHANUMERIC_CHARACTERS.length())));
		}
		return sb.toString();
	}

	private static String generateMD5Hash(String prnNumber, String destinationValue, String randomString)
			throws NoSuchAlgorithmException {
		String toHash = prnNumber + destinationValue + randomString;
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] hashInBytes = md.digest(toHash.getBytes());

		// Convert byte array into signum representation
		StringBuilder sb = new StringBuilder();
		for (byte b : hashInBytes) {
			sb.append(String.format("%02x", b));
		}
		return sb.toString();
	}
}
