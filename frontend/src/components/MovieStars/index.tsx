import { ReactComponent as StarFull} from 'assets/imgs/star-full.svg'
import { ReactComponent as StarHalf} from 'assets/imgs/star-half.svg'
import { ReactComponent as StarEmpty} from 'assets/imgs/star-empty.svg'
import './styles.css'

function MovieStars() {
    return (
        <div className="dsmovie-stars-container">
        <StarFull />
        <StarFull />
        <StarFull />
        <StarHalf />
        <StarEmpty />
      </div>
    )
}

export default MovieStars;