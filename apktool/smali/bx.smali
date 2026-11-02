.class public final Lbx;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Lbx;

.field public static final b:Lx82;

.field public static final c:Lx82;

.field public static final d:Lx82;

.field public static final e:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lbx;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lbx;->a:Lbx;

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
    const-string v3, "window"

    .line 27
    .line 28
    invoke-direct {v2, v3, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 29
    .line 30
    .line 31
    sput-object v2, Lbx;->b:Lx82;

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
    new-instance v2, Lx82;

    .line 44
    .line 45
    invoke-static {v0}, Lp61;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const-string v3, "logSourceMetrics"

    .line 50
    .line 51
    invoke-direct {v2, v3, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 52
    .line 53
    .line 54
    sput-object v2, Lbx;->c:Lx82;

    .line 55
    .line 56
    new-instance v0, Lov;

    .line 57
    .line 58
    const/4 v2, 0x3

    .line 59
    invoke-direct {v0, v2}, Lov;-><init>(I)V

    .line 60
    .line 61
    .line 62
    invoke-static {v1, v0}, Lp61;->r(Ljava/lang/Class;Lov;)Ljava/util/HashMap;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v2, Lx82;

    .line 67
    .line 68
    invoke-static {v0}, Lp61;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    const-string v3, "globalMetrics"

    .line 73
    .line 74
    invoke-direct {v2, v3, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 75
    .line 76
    .line 77
    sput-object v2, Lbx;->d:Lx82;

    .line 78
    .line 79
    new-instance v0, Lov;

    .line 80
    .line 81
    const/4 v2, 0x4

    .line 82
    invoke-direct {v0, v2}, Lov;-><init>(I)V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v0}, Lp61;->r(Ljava/lang/Class;Lov;)Ljava/util/HashMap;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    new-instance v1, Lx82;

    .line 90
    .line 91
    invoke-static {v0}, Lp61;->s(Ljava/util/HashMap;)Ljava/util/Map;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    const-string v2, "appNamespace"

    .line 96
    .line 97
    invoke-direct {v1, v2, v0}, Lx82;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 98
    .line 99
    .line 100
    sput-object v1, Lbx;->e:Lx82;

    .line 101
    .line 102
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Lfu0;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    sget-object p0, Lbx;->b:Lx82;

    .line 6
    .line 7
    iget-object v0, p1, Lfu0;->a:Lna8;

    .line 8
    .line 9
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 10
    .line 11
    .line 12
    sget-object p0, Lbx;->c:Lx82;

    .line 13
    .line 14
    iget-object v0, p1, Lfu0;->b:Ljava/util/List;

    .line 15
    .line 16
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 17
    .line 18
    .line 19
    sget-object p0, Lbx;->d:Lx82;

    .line 20
    .line 21
    iget-object v0, p1, Lfu0;->c:Lzr2;

    .line 22
    .line 23
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 24
    .line 25
    .line 26
    sget-object p0, Lbx;->e:Lx82;

    .line 27
    .line 28
    iget-object p1, p1, Lfu0;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {p2, p0, p1}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 31
    .line 32
    .line 33
    return-void
.end method
