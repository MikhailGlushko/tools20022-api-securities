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
import com.tools20022.repository.entity.Commodity;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PaperCommodityContainerBoard1;
import com.tools20022.repository.msg.PaperCommodityNewsprint1;
import com.tools20022.repository.msg.PaperCommodityPulp1;
import com.tools20022.repository.msg.PaperCommodityRecoveredPaper1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Defines commodity attributes of a derivative where the type is paper.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmContainerBoard
 * AssetClassCommodityPaper1Choice.mmContainerBoard}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmNewsprint
 * AssetClassCommodityPaper1Choice.mmNewsprint}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmPulp
 * AssetClassCommodityPaper1Choice.mmPulp}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice#mmRecoveredPaper
 * AssetClassCommodityPaper1Choice.mmRecoveredPaper}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Commodity Commodity}</li>
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
 * "AssetClassCommodityPaper1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Defines commodity attributes of a derivative where the type is paper."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AssetClassCommodityPaper1Choice", propOrder = {"containerBoard", "newsprint", "pulp", "recoveredPaper"})
public class AssetClassCommodityPaper1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CntnrBrd", required = true)
	protected PaperCommodityContainerBoard1 containerBoard;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityContainerBoard1
	 * PaperCommodityContainerBoard1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CntnrBrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContainerBoard"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Container board commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityContainerBoard1> mmContainerBoard = new MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityContainerBoard1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmObject();
			isDerived = false;
			xmlTag = "CntnrBrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContainerBoard";
			definition = "Container board commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaperCommodityContainerBoard1.mmObject();
		}

		@Override
		public PaperCommodityContainerBoard1 getValue(AssetClassCommodityPaper1Choice obj) {
			return obj.getContainerBoard();
		}

		@Override
		public void setValue(AssetClassCommodityPaper1Choice obj, PaperCommodityContainerBoard1 value) {
			obj.setContainerBoard(value);
		}
	};
	@XmlElement(name = "Nwsprnt", required = true)
	protected PaperCommodityNewsprint1 newsprint;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityNewsprint1
	 * PaperCommodityNewsprint1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Nwsprnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Newsprint"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Newsprint commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityNewsprint1> mmNewsprint = new MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityNewsprint1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmObject();
			isDerived = false;
			xmlTag = "Nwsprnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Newsprint";
			definition = "Newsprint commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaperCommodityNewsprint1.mmObject();
		}

		@Override
		public PaperCommodityNewsprint1 getValue(AssetClassCommodityPaper1Choice obj) {
			return obj.getNewsprint();
		}

		@Override
		public void setValue(AssetClassCommodityPaper1Choice obj, PaperCommodityNewsprint1 value) {
			obj.setNewsprint(value);
		}
	};
	@XmlElement(name = "Pulp", required = true)
	protected PaperCommodityPulp1 pulp;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaperCommodityPulp1
	 * PaperCommodityPulp1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pulp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Pulp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Pulp commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityPulp1> mmPulp = new MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityPulp1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmObject();
			isDerived = false;
			xmlTag = "Pulp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Pulp";
			definition = "Pulp commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaperCommodityPulp1.mmObject();
		}

		@Override
		public PaperCommodityPulp1 getValue(AssetClassCommodityPaper1Choice obj) {
			return obj.getPulp();
		}

		@Override
		public void setValue(AssetClassCommodityPaper1Choice obj, PaperCommodityPulp1 value) {
			obj.setPulp(value);
		}
	};
	@XmlElement(name = "RcvrdPpr", required = true)
	protected PaperCommodityRecoveredPaper1 recoveredPaper;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PaperCommodityRecoveredPaper1
	 * PaperCommodityRecoveredPaper1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Commodity#mmSubProduct
	 * Commodity.mmSubProduct}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.AssetClassCommodityPaper1Choice
	 * AssetClassCommodityPaper1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrdPpr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecoveredPaper"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Recovered paper commodity derivative."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityRecoveredPaper1> mmRecoveredPaper = new MMMessageAssociationEnd<AssetClassCommodityPaper1Choice, PaperCommodityRecoveredPaper1>() {
		{
			businessElementTrace_lazy = () -> Commodity.mmSubProduct;
			componentContext_lazy = () -> com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmObject();
			isDerived = false;
			xmlTag = "RcvrdPpr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecoveredPaper";
			definition = "Recovered paper commodity derivative.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PaperCommodityRecoveredPaper1.mmObject();
		}

		@Override
		public PaperCommodityRecoveredPaper1 getValue(AssetClassCommodityPaper1Choice obj) {
			return obj.getRecoveredPaper();
		}

		@Override
		public void setValue(AssetClassCommodityPaper1Choice obj, PaperCommodityRecoveredPaper1 value) {
			obj.setRecoveredPaper(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmContainerBoard, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmNewsprint,
						com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmPulp, com.tools20022.repository.choice.AssetClassCommodityPaper1Choice.mmRecoveredPaper);
				trace_lazy = () -> Commodity.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AssetClassCommodityPaper1Choice";
				definition = "Defines commodity attributes of a derivative where the type is paper.";
			}
		});
		return mmObject_lazy.get();
	}

	public PaperCommodityContainerBoard1 getContainerBoard() {
		return containerBoard;
	}

	public AssetClassCommodityPaper1Choice setContainerBoard(PaperCommodityContainerBoard1 containerBoard) {
		this.containerBoard = Objects.requireNonNull(containerBoard);
		return this;
	}

	public PaperCommodityNewsprint1 getNewsprint() {
		return newsprint;
	}

	public AssetClassCommodityPaper1Choice setNewsprint(PaperCommodityNewsprint1 newsprint) {
		this.newsprint = Objects.requireNonNull(newsprint);
		return this;
	}

	public PaperCommodityPulp1 getPulp() {
		return pulp;
	}

	public AssetClassCommodityPaper1Choice setPulp(PaperCommodityPulp1 pulp) {
		this.pulp = Objects.requireNonNull(pulp);
		return this;
	}

	public PaperCommodityRecoveredPaper1 getRecoveredPaper() {
		return recoveredPaper;
	}

	public AssetClassCommodityPaper1Choice setRecoveredPaper(PaperCommodityRecoveredPaper1 recoveredPaper) {
		this.recoveredPaper = Objects.requireNonNull(recoveredPaper);
		return this;
	}
}