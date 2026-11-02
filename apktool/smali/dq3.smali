.class public final Ldq3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Low3;


# static fields
.field public static final a:Ldq3;

.field public static final b:Lcq3;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Ldq3;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Ldq3;->a:Ldq3;

    .line 7
    .line 8
    sget-object v0, Lcq3;->b:Lcq3;

    .line 9
    .line 10
    sput-object v0, Ldq3;->b:Lcq3;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(Lol7;Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p2, Laq3;

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
    sget-object p0, Lyl7;->a:Lyl7;

    .line 10
    .line 11
    sget-object p0, Leo3;->a:Leo3;

    .line 12
    .line 13
    new-instance p0, Lua4;

    .line 14
    .line 15
    invoke-direct {p0}, Lua4;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, p2}, Lua4;->a(Lol7;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final b(Lrd1;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-static {p1}, Lyn0;->p(Lrd1;)Ltn3;

    .line 2
    .line 3
    .line 4
    new-instance p0, Laq3;

    .line 5
    .line 6
    sget-object v0, Lyl7;->a:Lyl7;

    .line 7
    .line 8
    sget-object v0, Leo3;->a:Leo3;

    .line 9
    .line 10
    new-instance v0, Lua4;

    .line 11
    .line 12
    invoke-direct {v0}, Lua4;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, La1;->b(Lrd1;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    check-cast p1, Ljava/util/Map;

    .line 20
    .line 21
    invoke-direct {p0, p1}, Laq3;-><init>(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-object p0
.end method

.method public final d()Le37;
    .locals 0

    .line 1
    sget-object p0, Ldq3;->b:Lcq3;

    .line 2
    .line 3
    return-object p0
.end method
