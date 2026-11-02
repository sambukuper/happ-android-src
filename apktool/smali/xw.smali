.class public final Lxw;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Lxw;

.field public static final b:Lx82;

.field public static final c:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxw;->a:Lxw;

    .line 7
    .line 8
    const-string v0, "networkType"

    .line 9
    .line 10
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lxw;->b:Lx82;

    .line 15
    .line 16
    const-string v0, "mobileSubtype"

    .line 17
    .line 18
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lxw;->c:Lx82;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    .line 1
    check-cast p1, Li35;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lwy;

    .line 7
    .line 8
    iget-object p0, p0, Lwy;->a:Lh35;

    .line 9
    .line 10
    sget-object v0, Lxw;->b:Lx82;

    .line 11
    .line 12
    invoke-interface {p2, v0, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 13
    .line 14
    .line 15
    check-cast p1, Lwy;

    .line 16
    .line 17
    iget-object p0, p1, Lwy;->b:Lg35;

    .line 18
    .line 19
    sget-object p1, Lxw;->c:Lx82;

    .line 20
    .line 21
    invoke-interface {p2, p1, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 22
    .line 23
    .line 24
    return-void
.end method
