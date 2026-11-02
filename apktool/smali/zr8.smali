.class public abstract Lzr8;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lvz7;

.field public static final b:Lvz7;

.field public static final c:Lvz7;

.field public static final d:Lgb3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lng8;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 5
    .line 6
    .line 7
    new-instance v1, Lvz7;

    .line 8
    .line 9
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 10
    .line 11
    .line 12
    sput-object v1, Lzr8;->a:Lvz7;

    .line 13
    .line 14
    new-instance v0, Lng8;

    .line 15
    .line 16
    const/4 v1, 0x6

    .line 17
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 18
    .line 19
    .line 20
    new-instance v1, Lvz7;

    .line 21
    .line 22
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 23
    .line 24
    .line 25
    sput-object v1, Lzr8;->b:Lvz7;

    .line 26
    .line 27
    new-instance v0, Lng8;

    .line 28
    .line 29
    const/4 v1, 0x7

    .line 30
    invoke-direct {v0, v1}, Lng8;-><init>(B)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lvz7;

    .line 34
    .line 35
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Lzr8;->c:Lvz7;

    .line 39
    .line 40
    new-instance v0, Lgb3;

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    invoke-direct {v0, v1, v1, v1, v1}, Lgb3;-><init>(Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lzr8;->d:Lgb3;

    .line 47
    .line 48
    return-void
.end method

.method public static final a(Lwr8;Lg09;Lgn2;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p2, p0}, Lgn2;->B(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-static {}, Lb61;->c()V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :cond_1
    new-instance p1, Lpr2;

    .line 22
    .line 23
    const/16 v0, 0x1a

    .line 24
    .line 25
    invoke-direct {p1, p2, v0}, Lpr2;-><init>(Lgn2;B)V

    .line 26
    .line 27
    .line 28
    const-string p2, ""

    .line 29
    .line 30
    invoke-static {p0, p2, p1}, Lz68;->v0(Lcc1;Ljava/lang/String;Lgn2;)V

    .line 31
    .line 32
    .line 33
    :cond_2
    return-void
.end method
