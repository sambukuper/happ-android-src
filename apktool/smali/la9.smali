.class public final Lla9;
.super Lm99;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# instance fields
.field public final synthetic g:Lu10;


# direct methods
.method public constructor <init>(Lu10;ILandroid/os/Bundle;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lla9;->g:Lu10;

    .line 2
    .line 3
    invoke-direct {p0, p1, p2, p3}, Lm99;-><init>(Lu10;ILandroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lla9;->g:Lu10;

    .line 2
    .line 3
    iget-object p0, p0, Lu10;->i:Lt10;

    .line 4
    .line 5
    sget-object v0, Lx11;->h0:Lx11;

    .line 6
    .line 7
    invoke-interface {p0, v0}, Lt10;->A(Lx11;)V

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x1

    .line 11
    return p0
.end method

.method public final b(Lx11;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lla9;->g:Lu10;

    .line 2
    .line 3
    iget-object p0, p0, Lu10;->i:Lt10;

    .line 4
    .line 5
    invoke-interface {p0, p1}, Lt10;->A(Lx11;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 9
    .line 10
    .line 11
    return-void
.end method
