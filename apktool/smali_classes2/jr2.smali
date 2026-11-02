.class public final Ljr2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lf91;


# instance fields
.field public final X:Lf63;

.field public final synthetic Y:Llr2;

.field public final synthetic Z:Lkr2;


# direct methods
.method public constructor <init>(Llr2;Lkr2;Lf63;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljr2;->Y:Llr2;

    .line 2
    .line 3
    iput-object p2, p0, Ljr2;->Z:Lkr2;

    .line 4
    .line 5
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object p3, p0, Ljr2;->X:Lf63;

    .line 12
    .line 13
    return-void
.end method


# virtual methods
.method public final d()V
    .locals 1

    .line 1
    iget-object v0, p0, Ljr2;->X:Lf63;

    .line 2
    .line 3
    iget-object v0, v0, Lf63;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 6
    .line 7
    invoke-static {p0}, Lhi5;->a0(Lf91;)Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lue3;->y(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    invoke-virtual {v0, p0}, Landroid/view/View;->setFocusableInTouchMode(Z)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final j()V
    .locals 3

    .line 1
    iget-object v0, p0, Ljr2;->X:Lf63;

    .line 2
    .line 3
    iget-object v0, v0, Lf63;->f0:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, Landroid/widget/RelativeLayout;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    new-instance v1, Li81;

    .line 11
    .line 12
    const/4 v2, 0x2

    .line 13
    invoke-direct {v1, p0, v2}, Li81;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Lx97;->U(Landroid/view/View;Lh91;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final q()Lov8;
    .locals 0

    .line 1
    iget-object p0, p0, Ljr2;->X:Lf63;

    .line 2
    .line 3
    return-object p0
.end method
