.class public final Lj52;
.super Leb4;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final d:Lw42;

.field public final e:Lb1;


# direct methods
.method public constructor <init>(Lw42;Lb1;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Lh52;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lh52;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Leb4;-><init>(Lnr4;)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lj52;->d:Lw42;

    .line 14
    .line 15
    iput-object p2, p0, Lj52;->e:Lb1;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final e(Landroidx/recyclerview/widget/l;I)V
    .locals 2

    .line 1
    check-cast p1, Li52;

    .line 2
    .line 3
    iget-object v0, p0, Leb4;->c:Liv;

    .line 4
    .line 5
    iget-object v0, v0, Liv;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    check-cast p2, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;

    .line 12
    .line 13
    iget-object v0, p1, Li52;->v:Llr;

    .line 14
    .line 15
    invoke-static {v0}, Lmb6;->g(Lg91;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, p1, Li52;->u:Lzz2;

    .line 19
    .line 20
    iget-object v0, p1, Lzz2;->Z:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 23
    .line 24
    invoke-virtual {p2}, Lsu/happ/proxyutility/dto/ExcludeSettingsCache;->b()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {v1}, Lwl7;->e0(Ljava/lang/String;)Landroid/text/Editable;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    iget-object p1, p1, Lzz2;->Z:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 38
    .line 39
    new-instance v0, Lg52;

    .line 40
    .line 41
    invoke-direct {v0, p0, p2}, Lg52;-><init>(Lj52;Lsu/happ/proxyutility/dto/ExcludeSettingsCache;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 45
    .line 46
    .line 47
    return-void
.end method

.method public final g(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/l;
    .locals 2

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    sget v0, Lt46;->item_recycler_excluded_route:I

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    sget p2, Le46;->et_ip_address:I

    .line 17
    .line 18
    invoke-static {p1, p2}, Lln7;->b(Landroid/view/View;I)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    new-instance p2, Lzz2;

    .line 27
    .line 28
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 29
    .line 30
    const/4 v1, 0x3

    .line 31
    invoke-direct {p2, p1, v0, v1}, Lzz2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    new-instance p1, Li52;

    .line 35
    .line 36
    invoke-direct {p1, p0, p2}, Li52;-><init>(Lj52;Lzz2;)V

    .line 37
    .line 38
    .line 39
    return-object p1

    .line 40
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    const-string p1, "Missing required view with ID: "

    .line 49
    .line 50
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    invoke-static {p0}, Lb61;->i(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    const/4 p0, 0x0

    .line 58
    return-object p0
.end method
