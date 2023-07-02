import express from 'express'
import {router as BookHttpController} from "./api/BookHttpController";


const app=express();

app.use('api/v1/books',BookHttpController);

app.listen(8081, () => console.log("Server has been started at 8081"));