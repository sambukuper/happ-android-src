.class public final synthetic Ljn1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lkn1;


# direct methods
.method public synthetic constructor <init>(Lkn1;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Ljn1;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Ljn1;->Y:Lkn1;

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
    .locals 5

    .line 1
    iget-byte p1, p0, Ljn1;->X:B

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    iget-object p0, p0, Ljn1;->Y:Lkn1;

    .line 5
    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    iget-object p1, p0, Lkn1;->y1:Lzl4;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    check-cast p1, Lsu/happ/proxyutility/feature/main/MainActivity;

    .line 18
    .line 19
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->H()Lcom/tencent/mmkv/MMKV;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const-string v2, "pref_run_without_routing"

    .line 24
    .line 25
    const/4 v3, 0x1

    .line 26
    invoke-virtual {v1, v2, v3}, Lcom/tencent/mmkv/MMKV;->p(Ljava/lang/String;Z)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lsu/happ/proxyutility/feature/main/MainActivity;->i0()V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    iget-object p1, p0, Lkn1;->t1:Lvz7;

    .line 37
    .line 38
    invoke-virtual {p1}, Lvz7;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    check-cast p1, Lmn6;

    .line 43
    .line 44
    invoke-static {p1}, Lmn6;->k(Lmn6;)Lsu/happ/proxyutility/domain/routing/entity/RouteProfile;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    iget-object v1, p0, Lqk2;->S0:Lg94;

    .line 51
    .line 52
    invoke-static {v1}, Lys0;->z(Lg94;)Lu84;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    new-instance v2, Ly9;

    .line 57
    .line 58
    const/4 v3, 0x4

    .line 59
    const/4 v4, 0x0

    .line 60
    invoke-direct {v2, p0, p1, v4, v3}, Ly9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq51;B)V

    .line 61
    .line 62
    .line 63
    const/4 p1, 0x3

    .line 64
    invoke-static {v1, v4, v2, p1}, Ljm4;->Q(Lb71;Lu61;Lrn2;I)Log7;

    .line 65
    .line 66
    .line 67
    :cond_1
    invoke-virtual {p0, v0, v0}, Lsn1;->R(ZZ)V

    .line 68
    .line 69
    .line 70
    return-void

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
