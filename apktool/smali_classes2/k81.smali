.class public final Lk81;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lfu6;


# direct methods
.method public constructor <init>(Lfu6;)V
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
    iput-object p1, p0, Lk81;->X:Lfu6;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 2

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
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 10
    .line 11
    iget-object v1, p0, Lfu6;->f0:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lfu6;->g0:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, Landroid/widget/LinearLayout;

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public final j()V
    .locals 4

    .line 1
    iget-object v0, p0, Lk81;->X:Lfu6;

    .line 2
    .line 3
    iget-object v1, v0, Lfu6;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lsu/happ/proxyutility/ui/foundation/component/HappInputField;

    .line 6
    .line 7
    new-instance v2, Li81;

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v2, p0, v3}, Li81;-><init>(Ljava/lang/Object;B)V

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v2}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, v0, Lfu6;->Z:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lcom/blacksquircle/ui/editorkit/widget/TextProcessor;

    .line 19
    .line 20
    new-instance v1, Lj81;

    .line 21
    .line 22
    invoke-direct {v1, p0}, Lj81;-><init>(Lk81;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 26
    .line 27
    .line 28
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Lk81;->X:Lfu6;

    .line 2
    .line 3
    return-object p0
.end method
