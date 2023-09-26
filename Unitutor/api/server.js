//Importar dependencias
const express = require("express");
const cors = require("cors");
const app = express();
//configuración de cors (control de acceso)
app.use(cors())
// analizar las solicitudes de tipo de contenido - application/json
app.use(express.json());
// analizar las solicitudes de tipo de contenido -
application/x-www-form-urlencoded
app.use(express.urlencoded({ extended: true }));
// ruta simple
app.get("/", (req, res) => {
res.json({ message: "Welcome to bezkoder application." });
});
// Configurar puertos
const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
console.log(`Server is running on port ${PORT}.`);
});
