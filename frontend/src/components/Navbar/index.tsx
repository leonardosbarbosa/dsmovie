import { ReactComponent as GithubIcon } from 'assets/imgs/github.svg'
import './styles.css'

function Navbar() {
    return (
        <header>
            <nav className='container'>
                <div className='dsmovie-nav-content'>
                    <h1>DSMovie</h1>
                    <a href="https://github.com/leonardosbarbosa">
                        <div className='dsmovie-contact-container'>
                            <GithubIcon />
                            <span className='dsmovie-contact-link'>/leonardosbarbosa</span>
                        </div>
                    </a>
                </div>
            </nav>
        </header>
    );
}

export default Navbar;