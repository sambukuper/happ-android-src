.class public final Lrn4;
.super Luy7;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lrn2;


# instance fields
.field public g0:Lnm4;

.field public h0:Ljava/lang/String;

.field public i0:Z

.field public final synthetic j0:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

.field public final synthetic k0:Ljava/lang/String;

.field public final synthetic l0:Lnm4;

.field public final synthetic m0:Ljava/lang/Integer;


# direct methods
.method public constructor <init>(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;Ljava/lang/String;Lnm4;Ljava/lang/Integer;Lq51;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lrn4;->j0:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 2
    .line 3
    iput-object p2, p0, Lrn4;->k0:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lrn4;->l0:Lnm4;

    .line 6
    .line 7
    iput-object p4, p0, Lrn4;->m0:Ljava/lang/Integer;

    .line 8
    .line 9
    const/4 p1, 0x2

    .line 10
    invoke-direct {p0, p1, p5}, Luy7;-><init>(ILq51;)V

    .line 11
    .line 12
    .line 13
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
    invoke-virtual {p0, p2, p1}, Lrn4;->n(Lq51;Ljava/lang/Object;)Lq51;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lrn4;

    .line 10
    .line 11
    sget-object p1, Ldn8;->a:Ldn8;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lrn4;->q(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final n(Lq51;Ljava/lang/Object;)Lq51;
    .locals 6

    .line 1
    new-instance v0, Lrn4;

    .line 2
    .line 3
    iget-object v3, p0, Lrn4;->l0:Lnm4;

    .line 4
    .line 5
    iget-object v4, p0, Lrn4;->m0:Ljava/lang/Integer;

    .line 6
    .line 7
    iget-object v1, p0, Lrn4;->j0:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 8
    .line 9
    iget-object v2, p0, Lrn4;->k0:Ljava/lang/String;

    .line 10
    .line 11
    move-object v5, p1

    .line 12
    invoke-direct/range {v0 .. v5}, Lrn4;-><init>(Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;Ljava/lang/String;Lnm4;Ljava/lang/Integer;Lq51;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method

.method public final q(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget-boolean v0, p0, Lrn4;->i0:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, Lrn4;->h0:Ljava/lang/String;

    .line 9
    .line 10
    iget-object p0, p0, Lrn4;->g0:Lnm4;

    .line 11
    .line 12
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 13
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
    const/4 p0, 0x0

    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-static {p1}, Lw39;->n0(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, Lrn4;->j0:Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;

    .line 27
    .line 28
    invoke-virtual {p1}, Lsu/happ/proxyutility/dto/XRayConfig$OutboundBean;->e()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    const-string v0, "HYSTERIA"

    .line 33
    .line 34
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v0}, Ldh3;->f(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    iget-object v0, p0, Lrn4;->l0:Lnm4;

    .line 48
    .line 49
    iget-object v2, p0, Lrn4;->k0:Ljava/lang/String;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    sget-object p0, Lof7;->a:Lof7;

    .line 54
    .line 55
    new-instance p0, Lzw2;

    .line 56
    .line 57
    const/16 p1, 0xf

    .line 58
    .line 59
    invoke-direct {p0, v0, v2, p1}, Lzw2;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 60
    .line 61
    .line 62
    invoke-static {v2, p0}, Lof7;->b(Ljava/lang/String;Lgn2;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    sget-object p1, Lof7;->a:Lof7;

    .line 67
    .line 68
    iget-object v3, p0, Lrn4;->m0:Ljava/lang/Integer;

    .line 69
    .line 70
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    iput-object v0, p0, Lrn4;->g0:Lnm4;

    .line 75
    .line 76
    iput-object v2, p0, Lrn4;->h0:Ljava/lang/String;

    .line 77
    .line 78
    iput-boolean v1, p0, Lrn4;->i0:Z

    .line 79
    .line 80
    invoke-virtual {p1, v2, v3, p0}, Lof7;->d(Ljava/lang/String;ILs51;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    sget-object p0, Lc71;->X:Lc71;

    .line 85
    .line 86
    if-ne p1, p0, :cond_3

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_3
    move-object p0, v0

    .line 90
    move-object v0, v2

    .line 91
    :goto_0
    invoke-interface {p0, v0, p1}, Lrn2;->K(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :goto_1
    sget-object p0, Ldn8;->a:Ldn8;

    .line 95
    .line 96
    return-object p0
.end method
