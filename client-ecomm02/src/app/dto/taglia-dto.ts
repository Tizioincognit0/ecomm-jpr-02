import { Token } from './token';
import { Taglia } from '../entity/taglia';

export class TagliaDto {
    taglia: Taglia = new Taglia();
    token: Token;
}