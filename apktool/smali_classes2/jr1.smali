.class public final synthetic Ljr1;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq2;


# static fields
.field public static final a:Ljr1;

.field private static final descriptor:Le37;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ljr1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ljr1;->a:Ljr1;

    .line 7
    .line 8
    new-instance v1, Lzp5;

    .line 9
    .line 10
    const-string v2, "su.happ.proxyutility.util.dnsttv.DnsTunnelController.JwtData"

    .line 11
    .line 12
    const/4 v3, 0x1

    .line 13
    invoke-direct {v1, v2, v0, v3}, Lzp5;-><init>(Ljava/lang/String;Ldq2;I)V

    .line 14
    .line 15
    .line 16
    const-string v0, "additional_info_code"

    .line 17
    .line 18
    invoke-virtual {v1, v0, v3}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Ljr1;->descriptor:Le37;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p2, Llr1;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    iget-object p0, p2, Llr1;->a:Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 7
    .line 8
    sget-object p2, Ljr1;->descriptor:Le37;

    .line 9
    .line 10
    invoke-virtual {p1, p2}, Lol7;->a(Le37;)Lol7;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p1, p2}, Lol7;->w(Le37;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    if-eqz p0, :cond_1

    .line 22
    .line 23
    :goto_0
    sget-object v0, Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;->INSTANCE:Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;

    .line 24
    .line 25
    const/4 v1, 0x0

    .line 26
    invoke-virtual {p1, p2, v1, v0, p0}, Lol7;->p(Le37;ILow3;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-virtual {p1, p2}, Lol7;->v(Le37;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 7

    .line 1
    sget-object p0, Ljr1;->descriptor:Le37;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lrd1;->t(Le37;)Lf01;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const/4 v0, 0x1

    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x0

    .line 10
    move v3, v0

    .line 11
    move v4, v1

    .line 12
    :goto_0
    if-eqz v3, :cond_2

    .line 13
    .line 14
    invoke-interface {p1, p0}, Lf01;->e(Le37;)I

    .line 15
    .line 16
    .line 17
    move-result v5

    .line 18
    const/4 v6, -0x1

    .line 19
    if-eq v5, v6, :cond_1

    .line 20
    .line 21
    if-nez v5, :cond_0

    .line 22
    .line 23
    sget-object v4, Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;->INSTANCE:Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;

    .line 24
    .line 25
    invoke-interface {p1, p0, v1, v4, v2}, Lf01;->x(Le37;ILow3;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    check-cast v2, Lsu/happ/proxyutility/dto/AdditionalInfoCode;

    .line 30
    .line 31
    move v4, v0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    new-instance p0, Lfn8;

    .line 34
    .line 35
    invoke-direct {p0, v5}, Lfn8;-><init>(I)V

    .line 36
    .line 37
    .line 38
    throw p0

    .line 39
    :cond_1
    move v3, v1

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-interface {p1, p0}, Lf01;->n(Le37;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, Llr1;

    .line 45
    .line 46
    invoke-direct {p0, v4, v2}, Llr1;-><init>(ILsu/happ/proxyutility/dto/AdditionalInfoCode;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public final c()[Low3;
    .locals 2

    .line 1
    sget-object p0, Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;->INSTANCE:Lsu/happ/proxyutility/dto/AdditionalInfoCode$$serializer;

    .line 2
    .line 3
    invoke-static {p0}, Lzc1;->Q(Low3;)Low3;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    const/4 v0, 0x1

    .line 8
    new-array v0, v0, [Low3;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    aput-object p0, v0, v1

    .line 12
    .line 13
    return-object v0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Ljr1;->descriptor:Le37;

    .line 2
    .line 3
    return-object p0
.end method
