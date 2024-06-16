import React,{useState,useEffect} from 'react'

export default function ProductEdit(props) {
    const [formdetails,setformdetails]=useState({pid:"",pname:"",qty:"",price:""});
    //initialization useEffect
    //it is equivalent to componetDidMount
    useEffect(()=>{
        setformdetails({...props.prod})
    },[]) 
    const changepid=(event)=>{
        setformdetails({...formdetails,pid:event.target.value})
    }
    const changepname=(event)=>{
        setformdetails({...formdetails,pname:event.target.value})
    }
    const changeqty=(event)=>{
        setformdetails({...formdetails,qty:event.target.value})
    }
    const changeprice=(event)=>{
        setformdetails({...formdetails,price:event.target.value})
    }
    const updateproduct=()=>{
        //validate data in the form
        if(formdetails.pid==="" || formdetails.pname==="" || formdetails.qty==="" || formdetails.price===""){
            alert("pls fill all the fields");
            return
        }
        //it will add data to array
        props.updateProduct(formdetails);
        //clear the form
        setformdetails({pid:"",pname:"",qty:"",price:""})
    }
  return (
    <div>
        <form>
            Product id: <input type="text" name="pid" id="pid"
            value={formdetails.pid}
            onChange={changepid} readOnly></input><br></br>

            Product Name: <input type="text" name="pname" id="pname"
            value={formdetails.pname}
            onChange={changepname}></input><br></br>

            Product Quantity: <input type="text" name="qty" id="qty"
            value={formdetails.qty}
            onChange={changeqty}
            ></input><br></br>

            Product price: <input type="text" name="price" id="price"
            value={formdetails.price}
            onChange={changeprice}></input><br></br>

            <button type="button" name="btn" id="btn" onClick={updateproduct}>Update Product</button>
        </form>
    </div>
  )
}
