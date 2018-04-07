/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.choice.AffirmationReason1Choice;
import com.tools20022.repository.entity.SecuritiesTradeStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ProprietaryReason1;
import com.tools20022.repository.msg.ProprietaryStatusAndReason1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of status for the affirmation.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmAffirmed
 * AffirmationStatus6Choice.mmAffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmUnaffirmed
 * AffirmationStatus6Choice.mmUnaffirmed}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice#mmProprietaryStatus
 * AffirmationStatus6Choice.mmProprietaryStatus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
 * SecuritiesTradeStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmAffirmationStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmAffirmationStatus}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AffirmationStatus6Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for the affirmation."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AffirmationStatus6Choice", propOrder = {"affirmed", "unaffirmed", "proprietaryStatus"})
public class AffirmationStatus6Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Affrmd", required = true)
	protected ProprietaryReason1 affirmed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
	 * AffirmationStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Affrmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Affirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of affirmation of a trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AffirmationStatus6Choice, ProprietaryReason1> mmAffirmed = new MMMessageAssociationEnd<AffirmationStatus6Choice, ProprietaryReason1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.AffirmationStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Affrmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Affirmed";
			definition = "Status of affirmation of a trade.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public ProprietaryReason1 getValue(AffirmationStatus6Choice obj) {
			return obj.getAffirmed();
		}

		@Override
		public void setValue(AffirmationStatus6Choice obj, ProprietaryReason1 value) {
			obj.setAffirmed(value);
		}
	};
	@XmlElement(name = "Uaffrmd", required = true)
	protected AffirmationReason1Choice unaffirmed;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationReason1Choice
	 * AffirmationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
	 * AffirmationStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Uaffrmd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unaffirmed"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade has been unaffirmed."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AffirmationStatus6Choice, AffirmationReason1Choice> mmUnaffirmed = new MMMessageAssociationEnd<AffirmationStatus6Choice, AffirmationReason1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.AffirmationStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "Uaffrmd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unaffirmed";
			definition = "Trade has been unaffirmed.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AffirmationReason1Choice.mmObject();
		}

		@Override
		public AffirmationReason1Choice getValue(AffirmationStatus6Choice obj) {
			return obj.getUnaffirmed();
		}

		@Override
		public void setValue(AffirmationStatus6Choice obj, AffirmationReason1Choice value) {
			obj.setUnaffirmed(value);
		}
	};
	@XmlElement(name = "PrtrySts")
	protected ProprietaryStatusAndReason1 proprietaryStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryStatusAndReason1
	 * ProprietaryStatusAndReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmAffirmationStatus
	 * SecuritiesTradeStatus.mmAffirmationStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AffirmationStatus6Choice
	 * AffirmationStatus6Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtrySts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProprietaryStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides a proprietary status and a proprietary reason of the affirmation of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AffirmationStatus6Choice, Optional<ProprietaryStatusAndReason1>> mmProprietaryStatus = new MMMessageAssociationEnd<AffirmationStatus6Choice, Optional<ProprietaryStatusAndReason1>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmAffirmationStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.AffirmationStatus6Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Provides a proprietary status and a proprietary reason of the affirmation of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public Optional<ProprietaryStatusAndReason1> getValue(AffirmationStatus6Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(AffirmationStatus6Choice obj, Optional<ProprietaryStatusAndReason1> value) {
			obj.setProprietaryStatus(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AffirmationStatus6Choice.mmAffirmed, com.tools20022.repository.choice.AffirmationStatus6Choice.mmUnaffirmed,
						com.tools20022.repository.choice.AffirmationStatus6Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV02.mmAffirmationStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AffirmationStatus6Choice";
				definition = "Choice of status for the affirmation.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProprietaryReason1 getAffirmed() {
		return affirmed;
	}

	public AffirmationStatus6Choice setAffirmed(ProprietaryReason1 affirmed) {
		this.affirmed = Objects.requireNonNull(affirmed);
		return this;
	}

	public AffirmationReason1Choice getUnaffirmed() {
		return unaffirmed;
	}

	public AffirmationStatus6Choice setUnaffirmed(AffirmationReason1Choice unaffirmed) {
		this.unaffirmed = Objects.requireNonNull(unaffirmed);
		return this;
	}

	public Optional<ProprietaryStatusAndReason1> getProprietaryStatus() {
		return proprietaryStatus == null ? Optional.empty() : Optional.of(proprietaryStatus);
	}

	public AffirmationStatus6Choice setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
		return this;
	}
}