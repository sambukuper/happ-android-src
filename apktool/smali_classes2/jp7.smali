.class public final Ljp7;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:B

.field public final synthetic h0:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;

.field public final synthetic i0:Lnp7;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;Lnp7;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ljp7;->h0:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;

    .line 2
    .line 3
    iput-object p2, p0, Ljp7;->i0:Lnp7;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1, p3}, Luy7;-><init>(ILq51;)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lb71;

    .line 2
    .line 3
    check-cast p2, Lq51;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ljp7;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Ljp7;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Ljp7;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 1

    .line 1
    new-instance p2, Ljp7;

    .line 2
    .line 3
    iget-object v0, p0, Ljp7;->h0:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;

    .line 4
    .line 5
    iget-object p0, p0, Ljp7;->i0:Lnp7;

    .line 6
    .line 7
    invoke-direct {p2, v0, p0, p1}, Ljp7;-><init>(Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;Lnp7;Lq51;)V

    .line 8
    .line 9
    .line 10
    return-object p2
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget-byte v0, p0, Ljp7;->g0:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x2

    .line 6
    const/4 v4, 0x1

    .line 7
    if-eqz v0, :cond_2

    .line 8
    .line 9
    if-eq v0, v4, :cond_1

    .line 10
    .line 11
    if-eq v0, v3, :cond_1

    .line 12
    .line 13
    if-ne v0, v2, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 17
    .line 18
    invoke-static {p0}, Lbt;->i(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    :goto_0
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_2
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p0, Ljp7;->h0:Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile;

    .line 30
    .line 31
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Error;

    .line 32
    .line 33
    iget-object v5, p0, Ljp7;->i0:Lnp7;

    .line 34
    .line 35
    sget-object v6, Lc71;->X:Lc71;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    iput-byte v4, p0, Ljp7;->g0:B

    .line 40
    .line 41
    sget-object p1, Lwn7;->a:Lwn7;

    .line 42
    .line 43
    invoke-virtual {v5, p1, p0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-ne p0, v6, :cond_5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_3
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$NoProfileSelected;

    .line 51
    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    iput-byte v3, p0, Ljp7;->g0:B

    .line 55
    .line 56
    sget-object p1, Lxn7;->a:Lxn7;

    .line 57
    .line 58
    invoke-virtual {v5, p1, p0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-ne p0, v6, :cond_5

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_4
    instance-of v0, p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Success;

    .line 66
    .line 67
    if-eqz v0, :cond_6

    .line 68
    .line 69
    check-cast p1, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Success;

    .line 70
    .line 71
    invoke-virtual {p1}, Lsu/happ/proxyutility/domain/routing/entity/StateExportProfile$Success;->a()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    new-instance v0, Lyn7;

    .line 79
    .line 80
    invoke-direct {v0, p1}, Lyn7;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    iput-byte v2, p0, Ljp7;->g0:B

    .line 84
    .line 85
    invoke-virtual {v5, v0, p0}, Lnp7;->i(Lco7;Luy7;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    if-ne p0, v6, :cond_5

    .line 90
    .line 91
    :goto_1
    return-object v6

    .line 92
    :cond_5
    :goto_2
    sget-object p0, Ldn8;->a:Ldn8;

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_6
    invoke-static {}, Lb61;->c()V

    .line 96
    .line 97
    .line 98
    return-object v1
.end method
