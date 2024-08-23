import React from 'react';
import styles from './Description.module.css';

function RecipeAuthor() {
const authorLink = "https://thecleaneatingcouple.com/"
const authorPhoto = "https://thecleaneatingcouple.com/wp-content/uploads/2022/04/cec-about-us-homepage-300x300.jpg";
const authorName = "The Clean Eating Couple: Liz & Tyler";
return (
    <div className = {styles.recipeAuthorBlock}>
        <img src={authorPhoto} alt = "Clean Eating Couple" className={styles.imageUpdates} />
 <div>
    <h3>{authorName}</h3>
    <a href={authorLink}>The Clean Eating Couple</a>
 </div>
    </div>
);
}

class RecipeDescription extends React.Component {
    render() {
        return (
            <div>
                <div>
                <h1>Mediterranean Chicken Orzo</h1>
                <p>This Mediterranean chicken orzo is easy to make with simple, healthy ingredients that are sure to give you a vibe of the Greek Isles!</p>
            </div>
            <RecipeAuthor />
            </div>
        )
    }
}

export default RecipeDescription;