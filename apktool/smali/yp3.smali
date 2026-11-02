.class public final Lyp3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Lyp3;

.field public static final b:Lg37;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lyp3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lyp3;->a:Lyp3;

    .line 7
    .line 8
    sget-object v0, Lj37;->M:Lj37;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    new-array v1, v1, [Le37;

    .line 12
    .line 13
    const-string v2, "kotlinx.serialization.json.JsonNull"

    .line 14
    .line 15
    invoke-static {v2, v0, v1}, Lkm4;->n(Ljava/lang/String;Lnr4;[Le37;)Lg37;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    sput-object v0, Lyp3;->b:Lg37;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Lwp3;

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
    invoke-virtual {p1}, Lol7;->o()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, Lyn0;->p(Lrd1;)Ltn3;

    .line 2
    .line 3
    .line 4
    invoke-interface {p1}, Lrd1;->w()Z

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lwp3;->INSTANCE:Lwp3;

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_0
    new-instance p0, Lvn3;

    .line 14
    .line 15
    const/4 p1, -0x1

    .line 16
    const/4 v0, 0x0

    .line 17
    const-string v1, "Expected \'null\' literal"

    .line 18
    .line 19
    invoke-static {p1, v1, v0, v0, v0}, Lys0;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-direct {p0, p1}, Lho3;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Lyp3;->b:Lg37;

    .line 2
    .line 3
    return-object p0
.end method
