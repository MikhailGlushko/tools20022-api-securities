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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02;
import com.tools20022.repository.choice.MatchingReason1Choice;
import com.tools20022.repository.choice.MatchingReason4Choice;
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
 * Choice of status for the matching.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatched
 * MatchingStatus23Choice.mmMatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchedWithTolerance
 * MatchingStatus23Choice.mmMatchedWithTolerance}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmMatchingAlleged
 * MatchingStatus23Choice.mmMatchingAlleged}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmUnmatched
 * MatchingStatus23Choice.mmUnmatched}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice#mmProprietaryStatus
 * MatchingStatus23Choice.mmProprietaryStatus}</li>
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
 * {@linkplain com.tools20022.repository.area.setr.SecuritiesTradeConfirmationStatusAdviceV02#mmMatchingStatus
 * SecuritiesTradeConfirmationStatusAdviceV02.mmMatchingStatus}</li>
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
 * "MatchingStatus23Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of status for the matching."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MatchingStatus23Choice", propOrder = {"matched", "matchedWithTolerance", "matchingAlleged", "unmatched", "proprietaryStatus"})
public class MatchingStatus23Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Mtchd", required = true)
	protected ProprietaryReason1 matched;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Matched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is matched."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MatchingStatus23Choice, ProprietaryReason1> mmMatched = new MMMessageAssociationEnd<MatchingStatus23Choice, ProprietaryReason1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.MatchingStatus23Choice.mmObject();
			isDerived = false;
			xmlTag = "Mtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Matched";
			definition = "Trade is matched.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public ProprietaryReason1 getValue(MatchingStatus23Choice obj) {
			return obj.getMatched();
		}

		@Override
		public void setValue(MatchingStatus23Choice obj, ProprietaryReason1 value) {
			obj.setMatched(value);
		}
	};
	@XmlElement(name = "MtchdWthTlrnce", required = true)
	protected ProprietaryReason1 matchedWithTolerance;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ProprietaryReason1
	 * ProprietaryReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchdWthTlrnce"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchedWithTolerance"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is matched with tolerance."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MatchingStatus23Choice, ProprietaryReason1> mmMatchedWithTolerance = new MMMessageAttribute<MatchingStatus23Choice, ProprietaryReason1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.MatchingStatus23Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchdWthTlrnce";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchedWithTolerance";
			definition = "Trade is matched with tolerance.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> ProprietaryReason1.mmObject();
		}

		@Override
		public ProprietaryReason1 getValue(MatchingStatus23Choice obj) {
			return obj.getMatchedWithTolerance();
		}

		@Override
		public void setValue(MatchingStatus23Choice obj, ProprietaryReason1 value) {
			obj.setMatchedWithTolerance(value);
		}
	};
	@XmlElement(name = "MtchgAllgd", required = true)
	protected MatchingReason4Choice matchingAlleged;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingReason4Choice
	 * MatchingReason4Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmMatchingStatus
	 * SecuritiesTradeStatus.mmMatchingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtchgAllgd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MatchingAlleged"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is matched alleged."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MatchingStatus23Choice, MatchingReason4Choice> mmMatchingAlleged = new MMMessageAssociationEnd<MatchingStatus23Choice, MatchingReason4Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmMatchingStatus;
			componentContext_lazy = () -> com.tools20022.repository.choice.MatchingStatus23Choice.mmObject();
			isDerived = false;
			xmlTag = "MtchgAllgd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MatchingAlleged";
			definition = "Trade is matched alleged.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingReason4Choice.mmObject();
		}

		@Override
		public MatchingReason4Choice getValue(MatchingStatus23Choice obj) {
			return obj.getMatchingAlleged();
		}

		@Override
		public void setValue(MatchingStatus23Choice obj, MatchingReason4Choice value) {
			obj.setMatchingAlleged(value);
		}
	};
	@XmlElement(name = "Umtchd", required = true)
	protected MatchingReason1Choice unmatched;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MatchingReason1Choice
	 * MatchingReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmReason
	 * SecuritiesTradeStatus.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Umtchd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Unmatched"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Trade is unmatched or mismatched."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MatchingStatus23Choice, MatchingReason1Choice> mmUnmatched = new MMMessageAssociationEnd<MatchingStatus23Choice, MatchingReason1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.choice.MatchingStatus23Choice.mmObject();
			isDerived = false;
			xmlTag = "Umtchd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Unmatched";
			definition = "Trade is unmatched or mismatched.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MatchingReason1Choice.mmObject();
		}

		@Override
		public MatchingReason1Choice getValue(MatchingStatus23Choice obj) {
			return obj.getUnmatched();
		}

		@Override
		public void setValue(MatchingStatus23Choice obj, MatchingReason1Choice value) {
			obj.setUnmatched(value);
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus
	 * SecuritiesTradeStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.MatchingStatus23Choice
	 * MatchingStatus23Choice}</li>
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
	 * "Provides a proprietary status and a proprietary reason of the processing status of the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MatchingStatus23Choice, Optional<ProprietaryStatusAndReason1>> mmProprietaryStatus = new MMMessageAssociationEnd<MatchingStatus23Choice, Optional<ProprietaryStatusAndReason1>>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTradeStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.MatchingStatus23Choice.mmObject();
			isDerived = false;
			xmlTag = "PrtrySts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProprietaryStatus";
			definition = "Provides a proprietary status and a proprietary reason of the processing status of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ProprietaryStatusAndReason1.mmObject();
		}

		@Override
		public Optional<ProprietaryStatusAndReason1> getValue(MatchingStatus23Choice obj) {
			return obj.getProprietaryStatus();
		}

		@Override
		public void setValue(MatchingStatus23Choice obj, Optional<ProprietaryStatusAndReason1> value) {
			obj.setProprietaryStatus(value.orElse(null));
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.MatchingStatus23Choice.mmMatched, com.tools20022.repository.choice.MatchingStatus23Choice.mmMatchedWithTolerance,
						com.tools20022.repository.choice.MatchingStatus23Choice.mmMatchingAlleged, com.tools20022.repository.choice.MatchingStatus23Choice.mmUnmatched,
						com.tools20022.repository.choice.MatchingStatus23Choice.mmProprietaryStatus);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesTradeConfirmationStatusAdviceV02.mmMatchingStatus);
				trace_lazy = () -> SecuritiesTradeStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MatchingStatus23Choice";
				definition = "Choice of status for the matching.";
			}
		});
		return mmObject_lazy.get();
	}

	public ProprietaryReason1 getMatched() {
		return matched;
	}

	public MatchingStatus23Choice setMatched(ProprietaryReason1 matched) {
		this.matched = Objects.requireNonNull(matched);
		return this;
	}

	public ProprietaryReason1 getMatchedWithTolerance() {
		return matchedWithTolerance;
	}

	public MatchingStatus23Choice setMatchedWithTolerance(ProprietaryReason1 matchedWithTolerance) {
		this.matchedWithTolerance = Objects.requireNonNull(matchedWithTolerance);
		return this;
	}

	public MatchingReason4Choice getMatchingAlleged() {
		return matchingAlleged;
	}

	public MatchingStatus23Choice setMatchingAlleged(MatchingReason4Choice matchingAlleged) {
		this.matchingAlleged = Objects.requireNonNull(matchingAlleged);
		return this;
	}

	public MatchingReason1Choice getUnmatched() {
		return unmatched;
	}

	public MatchingStatus23Choice setUnmatched(MatchingReason1Choice unmatched) {
		this.unmatched = Objects.requireNonNull(unmatched);
		return this;
	}

	public Optional<ProprietaryStatusAndReason1> getProprietaryStatus() {
		return proprietaryStatus == null ? Optional.empty() : Optional.of(proprietaryStatus);
	}

	public MatchingStatus23Choice setProprietaryStatus(ProprietaryStatusAndReason1 proprietaryStatus) {
		this.proprietaryStatus = proprietaryStatus;
		return this;
	}
}