.class public final Lex;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Lex;

.field public static final b:Lx82;

.field public static final c:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lex;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lex;->a:Lex;

    .line 7
    .line 8
    new-instance v0, Lov;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, v1}, Lov;-><init>(I)V

    .line 12
    .line 13
    .line 14
    const-class v1, Lk06;

    .line 15
    .line 16
    invoke-static {v1, v0}, Lp61;->r(Ljava/lang/Class;Lov;)Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    new-instance v2, Lx82;

    .line 21
    .line 22
    invoke-static {v0}, Lp61;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v3, "logSource"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lex;->b:Lx82;

    .line 32
    .line 33
    new-instance v0, Lov;

    .line 34
    .line 35
    const/4 v2, 0x2

    .line 36
    invoke-direct {v0, v2}, Lov;-><init>(I)V

    .line 37
    .line 38
    .line 39
    invoke-static {v1, v0}, Lp61;->r(Ljava/lang/Class;Lov;)Ljava/util/HashMap;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    new-instance v1, Lx82;

    .line 44
    .line 45
    invoke-static {v0}, Lp61;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v2, "logEventDropped"

    .line 50
    .line 51
    invoke-direct {v1, v2, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    sput-object v1, Lex;->c:Lx82;

    .line 55
    .line 56
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lhg4;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    sget-object p0, Lex;->b:Lx82;

    .line 6
    .line 7
    iget-object v0, p1, Lhg4;->a:Ljava/lang/String;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lex;->c:Lx82;

    .line 13
    .line 14
    iget-object p1, p1, Lhg4;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p2, p0, p1}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 17
    .line 18
    .line 19
    return-void
.end method
