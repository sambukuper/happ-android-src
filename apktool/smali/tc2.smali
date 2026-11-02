.class public final Ltc2;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final a:Lvz7;

.field public final b:Lvz7;

.field public final c:Lvz7;

.field public final d:Lvz7;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lj72;

    .line 5
    .line 6
    const/16 v1, 0x8

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Lvz7;

    .line 12
    .line 13
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v1, p0, Ltc2;->a:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lxl0;

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    invoke-direct {v0, p1, v1}, Lxl0;-><init>(Landroid/content/Context;B)V

    .line 22
    .line 23
    .line 24
    new-instance v1, Lvz7;

    .line 25
    .line 26
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 27
    .line 28
    .line 29
    iput-object v1, p0, Ltc2;->b:Lvz7;

    .line 30
    .line 31
    new-instance v0, Lj72;

    .line 32
    .line 33
    const/16 v1, 0x9

    .line 34
    .line 35
    invoke-direct {v0, v1}, Lj72;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lvz7;

    .line 39
    .line 40
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Ltc2;->c:Lvz7;

    .line 44
    .line 45
    new-instance v0, Lxl0;

    .line 46
    .line 47
    const/4 v1, 0x2

    .line 48
    invoke-direct {v0, p1, v1}, Lxl0;-><init>(Landroid/content/Context;B)V

    .line 49
    .line 50
    .line 51
    new-instance p1, Lvz7;

    .line 52
    .line 53
    invoke-direct {p1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 54
    .line 55
    .line 56
    iput-object p1, p0, Ltc2;->d:Lvz7;

    .line 57
    .line 58
    return-void
.end method
