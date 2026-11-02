.class public final Luw;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Luw;

.field public static final b:Lx82;

.field public static final c:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Luw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Luw;->a:Luw;

    .line 7
    .line 8
    const-string v0, "clientType"

    .line 9
    .line 10
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Luw;->b:Lx82;

    .line 15
    .line 16
    const-string v0, "androidClientInfo"

    .line 17
    .line 18
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Luw;->c:Lx82;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Leu0;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lyx;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p0, Ldu0;->X:Ldu0;

    .line 12
    .line 13
    sget-object v0, Luw;->b:Lx82;

    .line 14
    .line 15
    invoke-interface {p2, v0, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 16
    .line 17
    .line 18
    check-cast p1, Lyx;

    .line 19
    .line 20
    iget-object p0, p1, Lyx;->a:Lqx;

    .line 21
    .line 22
    sget-object p1, Luw;->c:Lx82;

    .line 23
    .line 24
    invoke-interface {p2, p1, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 25
    .line 26
    .line 27
    return-void
.end method
