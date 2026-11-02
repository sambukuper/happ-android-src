.class public final Ly;
.super Lxw8;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:Lov6;

.field public final c:Lvz7;

.field public final d:Lh76;


# direct methods
.method public constructor <init>(Lov6;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lxw8;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ly;->b:Lov6;

    .line 8
    .line 9
    new-instance v0, Lx;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-direct {v0, v1}, Lx;-><init>(B)V

    .line 13
    .line 14
    .line 15
    new-instance v1, Lvz7;

    .line 16
    .line 17
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 18
    .line 19
    .line 20
    iput-object v1, p0, Ly;->c:Lvz7;

    .line 21
    .line 22
    new-instance v0, Lw;

    .line 23
    .line 24
    const/4 v1, 0x0

    .line 25
    invoke-direct {v0, v1}, Lw;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lov6;->a(Landroid/os/Parcelable;)Lh76;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, Ly;->d:Lh76;

    .line 33
    .line 34
    return-void
.end method
