import { Serializable, JsonProperty } from 'typescript-json-serializer';
import { GameElement } from './gameElement';
import { XButton } from './xButton';

export enum NarrativeType {
  Text = 'text',
  Panorama = 'panorama'
}

export enum NarrativeStatus {
  Continue = 'continue',
  Win = 'win',
  Loose = 'loose'
}

@Serializable()
export class Narrative extends GameElement {

	/** Buttons for next steps if game continues */
	@JsonProperty() buttons: Array<XButton>;
	/** How to display the current narrative */
	@JsonProperty() narrativeType = NarrativeType.Text;
	/** Game continues of is finished */
	@JsonProperty() narrativeStatus = NarrativeStatus.Continue;

  isFinal(): boolean {
    return this.narrativeStatus !== NarrativeStatus.Continue;
  }
}
