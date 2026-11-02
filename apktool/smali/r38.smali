.class public abstract Lr38;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final a:Lox1;

.field public static final b:Lox1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lmq7;

    .line 2
    .line 3
    const/16 v1, 0x16

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lox1;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 12
    .line 13
    .line 14
    sput-object v1, Lr38;->a:Lox1;

    .line 15
    .line 16
    new-instance v0, Lmq7;

    .line 17
    .line 18
    const/16 v1, 0x17

    .line 19
    .line 20
    invoke-direct {v0, v1}, Lmq7;-><init>(B)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lox1;

    .line 24
    .line 25
    invoke-direct {v1, v0, v2}, Lox1;-><init>(Ldn2;B)V

    .line 26
    .line 27
    .line 28
    sput-object v1, Lr38;->b:Lox1;

    .line 29
    .line 30
    return-void
.end method
