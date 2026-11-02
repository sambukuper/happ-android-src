.class public final Lx74;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Ljt8;


# instance fields
.field public final a:Lvz7;


# direct methods
.method public constructor <init>(Ldn2;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lvz7;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lvz7;-><init>(Ldn2;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lx74;->a:Lvz7;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(Lkl5;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lx74;->a:Lvz7;

    .line 2
    .line 3
    invoke-virtual {p0}, Lvz7;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
