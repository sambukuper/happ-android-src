.class public abstract Lyf3;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lt03;

.field public static final b:Liv8;

.field public static final c:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lt03;

    .line 2
    .line 3
    sget-object v1, Lxf3;->X:Lxf3;

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lr8;-><init>(Lrn2;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, Lyf3;->a:Lt03;

    .line 9
    .line 10
    new-instance v0, Liv8;

    .line 11
    .line 12
    sget-object v1, Lwf3;->X:Lwf3;

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lr8;-><init>(Lrn2;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lyf3;->b:Liv8;

    .line 18
    .line 19
    new-instance v0, Lw60;

    .line 20
    .line 21
    const/16 v1, 0xc

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lw60;-><init>(B)V

    .line 24
    .line 25
    .line 26
    new-instance v1, Lvz7;

    .line 27
    .line 28
    invoke-direct {v1, v0}, Lvz7;-><init>(Ldn2;)V

    .line 29
    .line 30
    .line 31
    new-instance v0, Ltv2;

    .line 32
    .line 33
    const/16 v1, 0x1d

    .line 34
    .line 35
    invoke-direct {v0, v1}, Ltv2;-><init>(B)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Lox1;

    .line 39
    .line 40
    const/4 v2, 0x1

    .line 41
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 42
    .line 43
    .line 44
    sput-object v1, Lyf3;->c:Lox1;

    .line 45
    .line 46
    return-void
.end method
