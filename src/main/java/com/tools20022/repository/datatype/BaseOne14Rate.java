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

package com.tools20022.repository.datatype;

import com.tools20022.metamodel.MMRate;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.BaseOne14Rate.InternalXmlAdapter;
import com.tools20022.repository.GeneratedRepository;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.adapters.XmlAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * Rate expressed as a decimal, for example, 0.7 is 7/10 and 70% with 13
 * fractional digits maximum and 14 total digits.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getExample
 * example} =
 * <ul>
 * <li>"0,1234567890123"</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "BaseOne14Rate"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Rate expressed as a decimal, for example, 0.7 is 7/10 and 70% with 13 fractional digits maximum and 14 total digits."
 * </li>
 * </ul>
 */
@XmlJavaTypeAdapter(InternalXmlAdapter.class)
public class BaseOne14Rate {

	final static private AtomicReference<MMRate> mmObject_lazy = new AtomicReference<>();
	protected BigDecimal value;

	final static public MMRate mmObject() {
		mmObject_lazy.compareAndSet(null, new MMRate() {
			{
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				example = Arrays.asList("0,1234567890123");
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "BaseOne14Rate";
				definition = "Rate expressed as a decimal, for example, 0.7 is 7/10 and 70% with 13 fractional digits maximum and 14 total digits.";
				baseValue = 1.0;
				totalDigits = 14;
				fractionDigits = 13;
			}
		});
		return mmObject_lazy.get();
	}

	public BaseOne14Rate(BigDecimal value) {
		this.value = value;
	}

	public BigDecimal toBigDecimal() {
		return value;
	}

	protected static class InternalXmlAdapter extends XmlAdapter<BigDecimal, BaseOne14Rate> {
		@Override
		public BaseOne14Rate unmarshal(BigDecimal value) {
			return new BaseOne14Rate(value);
		}

		@Override
		public BigDecimal marshal(BaseOne14Rate typedData) {
			return typedData.value;
		}
	}
}