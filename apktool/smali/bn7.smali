.class public final synthetic Lbn7;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ldq2;


# static fields
.field public static final a:Lbn7;

.field private static final descriptor:Le37;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lbn7;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbn7;->a:Lbn7;

    .line 7
    .line 8
    new-instance v1, Lsc3;

    .line 9
    .line 10
    const-string v2, "su.happ.proxyutility.domain.sub.SubId"

    .line 11
    .line 12
    invoke-direct {v1, v2, v0}, Lsc3;-><init>(Ljava/lang/String;Ldq2;)V

    .line 13
    .line 14
    .line 15
    const-string v0, "value"

    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v1, v0, v2}, Lzp5;->k(Ljava/lang/String;Z)V

    .line 19
    .line 20
    .line 21
    sput-object v1, Lbn7;->descriptor:Le37;

    .line 22
    .line 23
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 2
    .line 3
    invoke-virtual {p2}, Lsu/happ/proxyutility/domain/sub/SubId;->d()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    sget-object p2, Lbn7;->descriptor:Le37;

    .line 11
    .line 12
    invoke-virtual {p1, p2}, Lol7;->i(Le37;)Lol7;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p1, p0}, Lol7;->t(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 0

    .line 1
    sget-object p0, Lbn7;->descriptor:Le37;

    .line 2
    .line 3
    invoke-interface {p1, p0}, Lrd1;->p(Le37;)Lrd1;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Lrd1;->s()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    new-instance p1, Lsu/happ/proxyutility/domain/sub/SubId;

    .line 15
    .line 16
    invoke-direct {p1, p0}, Lsu/happ/proxyutility/domain/sub/SubId;-><init>(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-object p1
.end method

.method public final c()[Low3;
    .locals 2

    .line 1
    const/4 p0, 0x1

    .line 2
    new-array p0, p0, [Low3;

    .line 3
    .line 4
    sget-object v0, Lyl7;->a:Lyl7;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    aput-object v0, p0, v1

    .line 8
    .line 9
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lbn7;->descriptor:Le37;

    .line 2
    .line 3
    return-object p0
.end method
