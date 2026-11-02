.class public final Lw42;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lv5;


# direct methods
.method public constructor <init>(Lv5;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw42;->X:Lv5;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 2

    .line 1
    iget-object p0, p0, Lw42;->X:Lv5;

    .line 2
    .line 3
    iget-object p0, p0, Lv5;->p0:Landroid/view/View;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    check-cast p0, Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    invoke-virtual {p0, v0}, Landroidx/recyclerview/widget/RecyclerView;->I(I)Landroidx/recyclerview/widget/l;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    instance-of v1, p0, Li52;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    check-cast p0, Li52;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p0, 0x0

    .line 23
    :goto_0
    if-nez p0, :cond_1

    .line 24
    .line 25
    return v0

    .line 26
    :cond_1
    iget-object p0, p0, Li52;->v:Llr;

    .line 27
    .line 28
    iget-object p0, p0, Llr;->Y:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Lzz2;

    .line 31
    .line 32
    iget-object p0, p0, Lzz2;->Z:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    return p0
.end method

.method public final d()V
    .locals 3

    .line 1
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lue3;->y(Landroid/content/Context;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object p0, p0, Lw42;->X:Lv5;

    .line 10
    .line 11
    iget-object v1, p0, Lv5;->n0:Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    invoke-virtual {v1, v2}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 15
    .line 16
    .line 17
    iget-object p0, p0, Lv5;->m0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 18
    .line 19
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lw42;->X:Lv5;

    .line 2
    .line 3
    iget-object v1, v0, Lv5;->n0:Lsu/happ/proxyutility/ui/foundation/component/HappEditText;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    new-instance v2, Lf52;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-direct {v2, p0, v3}, Lf52;-><init>(Lw42;B)V

    .line 12
    .line 13
    .line 14
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 15
    .line 16
    .line 17
    iget-object v0, v0, Lv5;->m0:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v1, Lf52;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-direct {v1, p0, v2}, Lf52;-><init>(Lw42;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Lw42;->X:Lv5;

    .line 2
    .line 3
    return-object p0
.end method
