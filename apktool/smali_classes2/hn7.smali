.class public final synthetic Lhn7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public final synthetic X:B

.field public final synthetic Y:Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;


# direct methods
.method public synthetic constructor <init>(Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, Lhn7;->X:B

    .line 2
    .line 3
    iput-object p1, p0, Lhn7;->Y:Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, Lhn7;->X:B

    .line 2
    .line 3
    sget-object v1, Ldn8;->a:Ldn8;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x2

    .line 7
    iget-object p0, p0, Lhn7;->Y:Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;

    .line 8
    .line 9
    const/4 v4, 0x1

    .line 10
    packed-switch v0, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    move-object v10, p1

    .line 14
    check-cast v10, Llp2;

    .line 15
    .line 16
    check-cast p2, Ljava/lang/Integer;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    sget p2, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->C0:I

    .line 23
    .line 24
    and-int/lit8 p2, p1, 0x3

    .line 25
    .line 26
    if-eq p2, v3, :cond_0

    .line 27
    .line 28
    move v2, v4

    .line 29
    :cond_0
    and-int/2addr p1, v4

    .line 30
    invoke-virtual {v10, p1, v2}, Llp2;->N(IZ)Z

    .line 31
    .line 32
    .line 33
    move-result p1

    .line 34
    if-eqz p1, :cond_1

    .line 35
    .line 36
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->y0:Ly5;

    .line 37
    .line 38
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    move-object v5, p1

    .line 43
    check-cast v5, Lnp7;

    .line 44
    .line 45
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->z0:Ly5;

    .line 46
    .line 47
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    move-object v6, p1

    .line 52
    check-cast v6, Lvv5;

    .line 53
    .line 54
    iget-object p1, p0, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->A0:Ly5;

    .line 55
    .line 56
    invoke-virtual {p1}, Ly5;->getValue()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v7, p1

    .line 61
    check-cast v7, Lgw5;

    .line 62
    .line 63
    iget-object v8, p0, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->B0:Lfn6;

    .line 64
    .line 65
    sget-object v9, Landroidx/compose/foundation/layout/b;->c:Landroidx/compose/foundation/layout/FillElement;

    .line 66
    .line 67
    const/16 v11, 0x6248

    .line 68
    .line 69
    invoke-static/range {v5 .. v11}, Lpn7;->g(Lnp7;Lvv5;Lgw5;Lfn6;Lkx4;Llp2;I)V

    .line 70
    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v10}, Llp2;->Q()V

    .line 74
    .line 75
    .line 76
    :goto_0
    return-object v1

    .line 77
    :pswitch_0
    check-cast p1, Llp2;

    .line 78
    .line 79
    check-cast p2, Ljava/lang/Integer;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    sget v0, Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;->C0:I

    .line 86
    .line 87
    and-int/lit8 v0, p2, 0x3

    .line 88
    .line 89
    if-eq v0, v3, :cond_2

    .line 90
    .line 91
    move v2, v4

    .line 92
    :cond_2
    and-int/2addr p2, v4

    .line 93
    invoke-virtual {p1, p2, v2}, Llp2;->N(IZ)Z

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    if-eqz p2, :cond_3

    .line 98
    .line 99
    new-instance p2, Lhn7;

    .line 100
    .line 101
    invoke-direct {p2, p0, v4}, Lhn7;-><init>(Lsu/happ/proxyutility/feature/routing/sub/SubRoutingActivity;B)V

    .line 102
    .line 103
    .line 104
    const p0, -0x6de64762

    .line 105
    .line 106
    .line 107
    invoke-static {p0, p2, p1}, Ljm4;->U(ILon2;Llp2;)Lzy0;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    const/4 p2, 0x6

    .line 112
    invoke-static {p0, p1, p2}, Li21;->a(Lzy0;Llp2;I)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    invoke-virtual {p1}, Llp2;->Q()V

    .line 117
    .line 118
    .line 119
    :goto_1
    return-object v1

    .line 120
    nop

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
