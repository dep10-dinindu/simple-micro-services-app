import express from "express";
import mysql from 'promise-mysql';

export const router = express.Router();

router.delete('/:isbn',(req,res)=>{
    res.send("<h1>Book is Deleted</h1>")
});

router.patch('/:isbn',(req,res)=>{
    res.send("<h1>Book is Updated</h1>")
})