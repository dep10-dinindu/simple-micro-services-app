import express from "express";
import {datasource} from '../db/dbcp'

export const router = express.Router();

console.log(datasource);

router.delete('/:isbn',(req,res)=>{
    res.send("<h1>Book is Deleted</h1>")
});

router.patch('/:isbn',(req,res)=>{
    res.send("<h1>Book is Updated</h1>")
})