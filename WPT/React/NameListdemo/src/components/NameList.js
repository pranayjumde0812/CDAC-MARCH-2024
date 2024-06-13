import React from 'react'
import NameForm from './NameForm'
import "./Header.css"
export default function NameList(props) {
    const addnewname=(name)=>{
        console.log("in NameList add new name",name)
        props.inserdata(name);

    }
    const removetheName=(name)=>{
        console.log("in NameListremove the  name",name)
        props.removedata(name);

    }
    const modifydata=(name,newname)=>{
        props.updatedata(name,newname);
    }
  return (
    <div>
    <div  className="test">
        <ul>
            {props.arr.map(ob=><li>{ob}</li>)}
        </ul>
    </div>
    <div className="test" >
        <NameForm insertName={addnewname} removeName={removetheName} modifyname={modifydata}></NameForm>
    </div>
    </div>
  )
}
