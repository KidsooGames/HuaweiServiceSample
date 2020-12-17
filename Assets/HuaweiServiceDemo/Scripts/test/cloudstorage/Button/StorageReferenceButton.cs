﻿using UnityEngine;
using UnityEngine.UI;


namespace CloudStorageTest
{
    public class StorageReferenceButton : MonoBehaviour
    {
        // Start is called before the first frame update
        public Button m_button;
        public StorageReferenceTest m_test;

        void Start()
        {
            Button btn = m_button.GetComponent<Button>();
            m_test = new StorageReferenceTest();
            btn.onClick.AddListener(m_test.run);
        }
    }
}