import logo from './logo.svg';
import './App.css';
import {useState,useEffect} from 'react';
import Header from './components/Header';
import Footer from './components/Footer';
import NameList from './components/NameList';
function App() {
  //create arrays as state because we want the changes should be reflected in the o/p
  const [namearr,setnamearr]=useState(["Rajan","Revati","Mugdha","Darshan"]);
  const [searcharr,setsearcharr]=useState(["Rajan","Revati","Mugdha","Darshan"]);

  const [search,setsearch]=useState("");

  const adddata=(name)=>{
   console.log("in adddata in app.js",name);
   setnamearr([...namearr,name])
  }

  const deletedata=(name)=>{
     var newarr=namearr.filter(ob=>ob!==name);
     setnamearr(newarr);
  }
  const modifydata=(name,newname)=>{
       var newarr=namearr.map(ob=>ob!==name?ob:newname)
       setnamearr(newarr);
  } 
  //this is equivalent to componentDidUpdate
  useEffect(()=>{
    //this function is called every time the change in namearr happens
    setsearcharr([...namearr])
  },[namearr])
useEffect(()=>{
  //this will executed every time setsearch happens
  //it will filter the namearr and only matching values will be kept in searcharr
  if(search===""){
    setsearcharr([...namearr]);
  }else{
    var newarr=namearr.filter(ob=>ob.includes(search));
    setsearcharr(newarr);
  }
},[search])
  const changesearch=(event)=>{
    setsearch(event.target.value)

  }
  return (
    <div>
      <Header></Header>
      Search <input type="text" name="search" id="search"
      value={search}
      onChange={changesearch}></input><br></br>

      <NameList arr={searcharr} inserdata={adddata} removedata={deletedata} updatedata={modifydata}></NameList>
      <Footer></Footer>
    </div>  
    
  );
}

export default App;
