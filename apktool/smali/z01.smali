.class public final Lz01;
.super Lq06;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final b:La11;


# direct methods
.method public constructor <init>(Lgn2;)V
    .locals 2

    .line 1
    new-instance v0, Lw01;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lw01;-><init>(B)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v0}, Lq06;-><init>(Ldn2;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, La11;

    .line 12
    .line 13
    invoke-direct {v0, p1}, La11;-><init>(Lgn2;)V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lz01;->b:La11;

    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final b()Ljt8;
    .locals 0

    .line 1
    iget-object p0, p0, Lz01;->b:La11;

    .line 2
    .line 3
    return-object p0
.end method
