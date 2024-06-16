import logo from './logo.svg';
import {useState} from 'react';
import './App.css';
import Header from './components/Header'
import Footer from './components/Footer';
import ProductTable from './components/ProductTable';
import ProductForm from './components/ProductForm';
function App() {
  const [prodarr,setprodarr]=useState([
    {pid:1,pname:"chair",qty:34,price:2344},
    {pid:2,pname:"Table",qty:45,price:2355},
    {pid:3,pname:"Shelf",qty:67,price:2313},
    {pid:4,pname:"desk",qty:30,price:2544}
    ])
   const [flag,setflag]=useState(false);
   const showform=()=>{
       setflag(true)
   }
  const addproductdetails=(prod)=>{
      setprodarr([...prodarr,{...prod}])
      setflag(false);
  }
  const removeproduct=(pid)=>{
      var newarr=prodarr.filter(ob=>ob.pid!==pid)
      setprodarr(newarr);
  }
  return (
    <div>
      <Header></Header>
      <button type="button" name="add" id="add" onClick={showform}>Add new product</button><br></br><br></br>
      <div style={{float:"left",margin:"20px"}}>
         <ProductTable parr={prodarr} deleteProduct={removeproduct}></ProductTable>
      </div>
      {/* conditional rendering */}
      {flag?<div>
      <ProductForm insertProduct={addproductdetails}></ProductForm>
      </div>:""}
      
      <Footer></Footer>
    </div>
  );
}

export default App;
