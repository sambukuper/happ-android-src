.class public final Lhd5;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"

# interfaces
.implements Lp85;


# instance fields
.field public final X:Z


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lhd5;->X:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    check-cast p1, Laq7;

    .line 2
    .line 3
    new-instance v0, Lgd5;

    .line 4
    .line 5
    iget-boolean p0, p0, Lhd5;->X:Z

    .line 6
    .line 7
    invoke-direct {v0, p1, p0}, Lgd5;-><init>(Laq7;Z)V

    .line 8
    .line 9
    .line 10
    new-instance p0, Lfd5;

    .line 11
    .line 12
    invoke-direct {p0, v0}, Lfd5;-><init>(Lgd5;)V

    .line 13
    .line 14
    .line 15
    iput-object p0, v0, Lgd5;->j0:Lfd5;

    .line 16
    .line 17
    iget-object v1, p1, Laq7;->X:Lk01;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lk01;->b(Lcq7;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0}, Laq7;->f(Liv5;)V

    .line 23
    .line 24
    .line 25
    return-object v0
.end method
