#初始化仓库
git init
#关联远程仓库
git remote add origin https://github.com/huanggua53719/springcloudalibaba.git
#添加
git add *
#提交
git commit -m "初次提交"
#拉取
git pull origin master

git pull 失败 ,提示：fatal: refusing to merge unrelated histories

git pull origin master --allow-unrelated-histories

后面加上 --allow-unrelated-histories ， 把两段不相干的 分支进行强行合并

#上传
git push -u -f origin master

#删除文件夹上传

git rm -r --cached .idea            
git commit -m '删除.idea' 
git push -u -f origin master      
