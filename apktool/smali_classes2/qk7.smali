.class public final Lqk7;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lvz7;

.field public final c:Loh7;

.field public final d:Lh76;


# direct methods
.method public constructor <init>()V
    .locals 4

    .line 1
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lr47;

    .line 5
    .line 6
    const/16 v1, 0x18

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lr47;-><init>(B)V

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
    iput-object v1, p0, Lqk7;->b:Lvz7;

    .line 17
    .line 18
    new-instance v0, Lpk7;

    .line 19
    .line 20
    sget-object v1, Lec7;->Y:Lec7;

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    const/4 v3, 0x0

    .line 24
    invoke-direct {v0, v1, v2, v2, v3}, Lpk7;-><init>(Lj2;ZILjava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-static {v0}, Lph7;->a(Ljava/lang/Object;)Loh7;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iput-object v0, p0, Lqk7;->c:Loh7;

    .line 32
    .line 33
    invoke-static {v0}, Ljm4;->n(Loh7;)Lh76;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    iput-object v0, p0, Lqk7;->d:Lh76;

    .line 38
    .line 39
    return-void
.end method
