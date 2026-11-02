.class public final Lvw;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lb85;


# static fields
.field public static final a:Lvw;

.field public static final b:Lx82;

.field public static final c:Lx82;

.field public static final d:Lx82;

.field public static final e:Lx82;

.field public static final f:Lx82;

.field public static final g:Lx82;

.field public static final h:Lx82;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lvw;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lvw;->a:Lvw;

    .line 7
    .line 8
    const-string v0, "eventTimeMs"

    .line 9
    .line 10
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lvw;->b:Lx82;

    .line 15
    .line 16
    const-string v0, "eventCode"

    .line 17
    .line 18
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lvw;->c:Lx82;

    .line 23
    .line 24
    const-string v0, "eventUptimeMs"

    .line 25
    .line 26
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    sput-object v0, Lvw;->d:Lx82;

    .line 31
    .line 32
    const-string v0, "sourceExtension"

    .line 33
    .line 34
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    sput-object v0, Lvw;->e:Lx82;

    .line 39
    .line 40
    const-string v0, "sourceExtensionJsonProto3"

    .line 41
    .line 42
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sput-object v0, Lvw;->f:Lx82;

    .line 47
    .line 48
    const-string v0, "timezoneOffsetSeconds"

    .line 49
    .line 50
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    sput-object v0, Lvw;->g:Lx82;

    .line 55
    .line 56
    const-string v0, "networkConnectionInfo"

    .line 57
    .line 58
    invoke-static {v0}, Lx82;->a(Ljava/lang/String;)Lx82;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sput-object v0, Lvw;->h:Lx82;

    .line 63
    .line 64
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    check-cast p1, Laf4;

    .line 2
    .line 3
    check-cast p2, Lc85;

    .line 4
    .line 5
    move-object p0, p1

    .line 6
    check-cast p0, Lty;

    .line 7
    .line 8
    iget-wide v0, p0, Lty;->a:J

    .line 9
    .line 10
    sget-object p0, Lvw;->b:Lx82;

    .line 11
    .line 12
    invoke-interface {p2, p0, v0, v1}, Lc85;->e(Lx82;J)Lc85;

    .line 13
    .line 14
    .line 15
    check-cast p1, Lty;

    .line 16
    .line 17
    iget-object p0, p1, Lty;->b:Ljava/lang/Integer;

    .line 18
    .line 19
    sget-object v0, Lvw;->c:Lx82;

    .line 20
    .line 21
    invoke-interface {p2, v0, p0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 22
    .line 23
    .line 24
    sget-object p0, Lvw;->d:Lx82;

    .line 25
    .line 26
    iget-wide v0, p1, Lty;->c:J

    .line 27
    .line 28
    invoke-interface {p2, p0, v0, v1}, Lc85;->e(Lx82;J)Lc85;

    .line 29
    .line 30
    .line 31
    sget-object p0, Lvw;->e:Lx82;

    .line 32
    .line 33
    iget-object v0, p1, Lty;->d:[B

    .line 34
    .line 35
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 36
    .line 37
    .line 38
    sget-object p0, Lvw;->f:Lx82;

    .line 39
    .line 40
    iget-object v0, p1, Lty;->e:Ljava/lang/String;

    .line 41
    .line 42
    invoke-interface {p2, p0, v0}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 43
    .line 44
    .line 45
    sget-object p0, Lvw;->g:Lx82;

    .line 46
    .line 47
    iget-wide v0, p1, Lty;->f:J

    .line 48
    .line 49
    invoke-interface {p2, p0, v0, v1}, Lc85;->e(Lx82;J)Lc85;

    .line 50
    .line 51
    .line 52
    sget-object p0, Lvw;->h:Lx82;

    .line 53
    .line 54
    iget-object p1, p1, Lty;->g:Li35;

    .line 55
    .line 56
    invoke-interface {p2, p0, p1}, Lc85;->a(Lx82;Ljava/lang/Object;)Lc85;

    .line 57
    .line 58
    .line 59
    return-void
.end method
