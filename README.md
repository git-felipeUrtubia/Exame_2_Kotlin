# Practica_KT – App en Kotlin con Jetpack Compose

Aplicación móvil desarrollada en Kotlin usando Jetpack Compose.  
Incluye manejo de estado, callbacks entre componentes, lectura de datos desde JSON y navegación basada en un `NavGraph`.

## 📂 Estructura del Proyecto
- `ui/` – Componentes visuales (Cards, BottomBar, Screen)
- `scripts/` – Funciones reutilizables (lectura de JSON, formateo, etc.)
- `componentsHome/` – Vista principal con lista de productos
- `componentsPay/` – Vista de pago y selección
- `raw/` – Archivo JSON

## 🛠️ Tecnologías
- Kotlin
- Jetpack Compose
- MutableState / remember
- LazyColumn y Grid
- Arquitectura por componentes

## 🧠 Funcionalidades destacadas
- Variable global `GamesSelected` para estado compartido
- Callbacks para comunicación entre componentes
- Lectura de datos desde JSON con `ReadJson` y `parseJsonToList`
- Sistema de UI reactiva por recomposición

## 🚀 Cómo ejecutar
1. Clonar el repositorio
2. Abrir en Android Studio
3. Ejecutar en emulador

## 👤 Autor
Felipe Urtubia
