.class public final Lfk;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lek;


# instance fields
.field public final a:Lce8;

.field public final b:Lrh5;

.field public final c:Lx77;


# direct methods
.method public constructor <init>(Lce8;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfk;->a:Lce8;

    .line 5
    .line 6
    new-instance p1, Lpf3;

    .line 7
    .line 8
    const-wide/16 v0, 0x0

    .line 9
    .line 10
    invoke-direct {p1, v0, v1}, Lpf3;-><init>(J)V

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lz51;->H(Ljava/lang/Object;)Lrh5;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lfk;->b:Lrh5;

    .line 18
    .line 19
    new-instance p1, Lx77;

    .line 20
    .line 21
    invoke-direct {p1}, Lx77;-><init>()V

    .line 22
    .line 23
    .line 24
    iput-object p1, p0, Lfk;->c:Lx77;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Lce8;
    .locals 0

    .line 1
    iget-object p0, p0, Lfk;->a:Lce8;

    .line 2
    .line 3
    return-object p0
.end method
