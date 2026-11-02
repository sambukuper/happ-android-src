.class public final synthetic Lln1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lnn1;


# direct methods
.method public synthetic constructor <init>(Lnn1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lln1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lln1;->Y:Lnn1;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget-byte p1, p0, Lln1;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    packed-switch p1, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lln1;->Y:Lnn1;

    .line 8
    .line 9
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object v4, p0, Lln1;->Y:Lnn1;

    .line 14
    .line 15
    iget-object v3, v4, Lnn1;->E1:Ljava/lang/String;

    .line 16
    .line 17
    if-eqz v3, :cond_1

    .line 18
    .line 19
    iget-object p0, v4, Lsn1;->o1:Landroid/app/Dialog;

    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object p0, v4, Lqk2;->S0:Lg94;

    .line 31
    .line 32
    invoke-static {p0}, Lys0;->z(Lg94;)Lu84;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    sget-object p1, Ltp1;->a:Lnf1;

    .line 37
    .line 38
    sget-object p1, Lye1;->Z:Lye1;

    .line 39
    .line 40
    new-instance v1, Lco;

    .line 41
    .line 42
    const/4 v6, 0x1

    .line 43
    invoke-direct/range {v1 .. v6}, Lco;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lq51;B)V

    .line 44
    .line 45
    .line 46
    const/4 v2, 0x2

    .line 47
    invoke-static {p0, p1, v5, v1, v2}, Lw51;->G(Lb71;Ls61;Le71;Lrn2;I)Log7;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    :cond_0
    if-nez v5, :cond_2

    .line 52
    .line 53
    :cond_1
    iget-object p0, v4, Lsn1;->o1:Landroid/app/Dialog;

    .line 54
    .line 55
    if-eqz p0, :cond_2

    .line 56
    .line 57
    invoke-virtual {p0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    if-eqz p0, :cond_2

    .line 62
    .line 63
    const-string p1, "Fail Create Dialog"

    .line 64
    .line 65
    invoke-static {p0, p1}, Lx79;->i(Landroid/content/Context;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {v4, v0, v0}, Lsn1;->R(ZZ)V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
