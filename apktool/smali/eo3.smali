.class public final Leo3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Leo3;

.field public static final b:Lg37;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Leo3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Leo3;->a:Leo3;

    .line 7
    .line 8
    sget-object v0, Lqq5;->M:Lqq5;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Le37;

    .line 12
    .line 13
    new-instance v2, Luh3;

    .line 14
    .line 15
    const/4 v3, 0x2

    .line 16
    invoke-direct {v2, v3}, Luh3;-><init>(B)V

    .line 17
    .line 18
    .line 19
    const-string v3, "kotlinx.serialization.json.JsonElement"

    .line 20
    .line 21
    invoke-static {v3, v0, v1, v2}, Lkm4;->m(Ljava/lang/String;Lnr4;[Le37;Lgn2;)Lg37;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Leo3;->b:Lg37;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lao3;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lyn0;->q(Lol7;)V

    .line 7
    .line 8
    .line 9
    instance-of p0, p2, Lhq3;

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lkq3;->a:Lkq3;

    .line 14
    .line 15
    invoke-virtual {p1, p0, p2}, Lol7;->r(Low3;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    instance-of p0, p2, Laq3;

    .line 20
    .line 21
    if-eqz p0, :cond_1

    .line 22
    .line 23
    sget-object p0, Ldq3;->a:Ldq3;

    .line 24
    .line 25
    invoke-virtual {p1, p0, p2}, Lol7;->r(Low3;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p0, p2, Ldn3;

    .line 30
    .line 31
    if-eqz p0, :cond_2

    .line 32
    .line 33
    sget-object p0, Lgn3;->a:Lgn3;

    .line 34
    .line 35
    invoke-virtual {p1, p0, p2}, Lol7;->r(Low3;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    invoke-static {}, Lb61;->c()V

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-static {p1}, Lyn0;->p(Lrd1;)Ltn3;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ltn3;->i()Lao3;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Leo3;->b:Lg37;

    .line 2
    .line 3
    return-object p0
.end method
