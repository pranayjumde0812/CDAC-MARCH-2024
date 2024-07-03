using EStoreWebApp.Models;
using EStoreWebApp.Repositories;
using System.Collections.Generic;
namespace EStoreWebApp.Services
{
    public class UserService : IUserService
    {
        public UserService() { 

        }
        public bool Delete(int id)
        {
            bool status = false;
            //code to delete user
            return status;
        }

        public User GetUser(int id)
        {
             User user = null;
            //code segment
            return user;
        }

        public List<User> GetUsers()
        {
           List<User> users= UsersRepoManager.GetUsers();
           return users;
        }

        public bool Insert(User user)
        {

             return true;
        }

        public bool Update(User user)
        {
            return false;
             
        }
    }
}
