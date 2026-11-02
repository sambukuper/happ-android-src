.class public final Lv47;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lh91;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lf63;


# direct methods
.method public synthetic constructor <init>(Lf63;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lv47;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lv47;->Y:Lf63;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c()Z
    .locals 2

    .line 1
    iget-byte v0, p0, Lv47;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv47;->Y:Lf63;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lf63;->v()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lf63;->v()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    iget-object v0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v0, Lc6;

    .line 21
    .line 22
    iget-object v1, v0, Lc6;->f0:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_0

    .line 31
    .line 32
    iget-object p0, v0, Lc6;->f0:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v1, v0, Lc6;->n0:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 44
    .line 45
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_1

    .line 50
    .line 51
    iget-object p0, v0, Lc6;->n0:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast p0, Landroid/widget/RelativeLayout;

    .line 54
    .line 55
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    invoke-virtual {p0}, Lf63;->v()Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    :goto_0
    return p0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lv47;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv47;->Y:Lf63;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lf63;->w()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lf63;->w()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, Lf63;->w()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final g()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lv47;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv47;->Y:Lf63;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lf63;->s()Z

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    return p0

    .line 13
    :pswitch_0
    invoke-virtual {p0}, Lf63;->s()Z

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    :pswitch_1
    invoke-virtual {p0}, Lf63;->s()Z

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-byte v0, p0, Lv47;->X:B

    .line 2
    .line 3
    iget-object p0, p0, Lv47;->Y:Lf63;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p0, Lc6;

    .line 11
    .line 12
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0

    .line 21
    :pswitch_0
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p0, Lc6;

    .line 24
    .line 25
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    return p0

    .line 34
    :pswitch_1
    iget-object p0, p0, Lf63;->Y:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p0, Lc6;

    .line 37
    .line 38
    iget-object p0, p0, Lc6;->j0:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 41
    .line 42
    invoke-virtual {p0}, Landroid/view/View;->requestFocus()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    return p0

    .line 47
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
