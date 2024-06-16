import React,{useState} from 'react'
import ProductEdit from './ProductEdit';

export default function ProductTable(props) {
    const [flag,setflag]=useState(false)
    const [product,setproduct]=useState({})
    const deleteProduct=(pid)=>{
        props.deleteProduct(pid);
    }
    const editproduct=(p)=>{
        setflag(true);
        setproduct({...p});

    }
  return (
    <div>
        <table border='2'>
        <thead>
            <tr>
                <th>Product pid</th>
                <th>Product name</th>
                <th>Quantity</th>
                <th>price</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            {props.parr.map((prod,index)=><tr key={prod.pid}>
                <td>{prod.pid}</td>
                <td>{prod.pname}</td>
                <td>{prod.qty}</td>
                <td>{prod.price}</td>
                <td>
                    <button type="button" name="btn" id='delete' onClick={()=>{deleteProduct(prod.pid)}}>Delete</button>
                    &nbsp;&nbsp;&nbsp;
                    <button type="button" name="btn" id='Edit' onClick={()=>{editproduct(prod)}}>Edit</button>
                    &nbsp;&nbsp;&nbsp;
                    <button type="button" name="btn" id='View'>View</button>
                </td>
            </tr>)}
            </tbody>
        </table>
        {flag?<div>
            <ProductEdit prod={product}></ProductEdit>
        </div>:""}
        
    </div>
  )
}
