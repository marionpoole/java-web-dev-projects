import { useState } from 'react'
import './App.css'
import RecipeDescription from './components/Description.jsx'
import RecipeIngredients from './components/Ingredients.jsx'
import RecipePhoto from './components/Photos.jsx';

function App() {

  return (
    <div className="App">
      <div className="recipePhotoBlock">
        <RecipePhoto />
        <div>
          <RecipeDescription />
          <RecipeIngredients />
        </div>
      </div>
    </div>
  )
}

export default App