import React,{useState,useRef} from 'react'
 
export default function (props) {
    const [name,setname]=useState("");
    //create a variable using useRef hook ---step 1
    //add ref property in input text box ---step 2
    //use inputref to get the direct access to texbox
    //every ref has current property
    const inputref=useRef();
    //to assign the value from the textbox to name state variable
    const changename=(event)=>{
         setname(event.target.value)
    }
    const addname=(event)=>{
        console.log("in add name Nameform",name)
        props.insertName(name);
        setname("");
        //bring the focus in the text box
        inputref.current.focus();
        //to bring the focus in the text box need to use useRef

    }

    const deleteName=()=>{
        props.removeName(name);
        //clear the textbox
        setname("");
        //bring the focus in the text box
        inputref.current.focus();
    }
    const updatename=()=>{
        var newname=prompt("enter new name");
        props.modifyname(name,newname);
        //clear the textbox
        setname("");
        //bring the focus in the text box
        inputref.current.focus();
    }
  return (
    <div>
        <form>
            Name: <input type="text" name="add" id="nm" ref={inputref}
            value={name}
            onChange={changename}></input><br></br>

            <button type="button" name="btn" id="add" value="add" onClick={addname}>Add Name</button>

            &nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" name="delete" id="delete" value="delete" onClick={deleteName}>Delete Name</button>

            &nbsp;&nbsp;&nbsp;&nbsp;
            <button type="button" name="update" id="update" value="update" onClick={updatename}>Update Name</button>
        </form>
    </div>
  )
}
