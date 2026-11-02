.class public abstract Ls07;
.super Ljava/lang/Object;
.source "r8-map-id-44e235b9ef01a485f680d0275e0bd7ddccd9597cc07e9835722c2ab00d70acf5"


# static fields
.field public static final A:Le17;

.field public static final B:Le17;

.field public static final C:Le17;

.field public static final a:Le17;

.field public static final b:Le17;

.field public static final c:Le17;

.field public static final d:Le17;

.field public static final e:Le17;

.field public static final f:Le17;

.field public static final g:Le17;

.field public static final h:Le17;

.field public static final i:Le17;

.field public static final j:Le17;

.field public static final k:Le17;

.field public static final l:Le17;

.field public static final m:Le17;

.field public static final n:Le17;

.field public static final o:Le17;

.field public static final p:Le17;

.field public static final q:Le17;

.field public static final r:Le17;

.field public static final s:Le17;

.field public static final t:Le17;

.field public static final u:Le17;

.field public static final v:Le17;

.field public static final w:Le17;

.field public static final x:Le17;

.field public static final y:Le17;

.field public static final z:Le17;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    sget-object v0, Lg0;->p0:Lg0;

    .line 2
    .line 3
    new-instance v1, Le17;

    .line 4
    .line 5
    const-string v2, "GetTextLayoutResult"

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 9
    .line 10
    .line 11
    sput-object v1, Ls07;->a:Le17;

    .line 12
    .line 13
    new-instance v1, Le17;

    .line 14
    .line 15
    const-string v2, "OnClick"

    .line 16
    .line 17
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 18
    .line 19
    .line 20
    sput-object v1, Ls07;->b:Le17;

    .line 21
    .line 22
    new-instance v1, Le17;

    .line 23
    .line 24
    const-string v2, "OnLongClick"

    .line 25
    .line 26
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 27
    .line 28
    .line 29
    sput-object v1, Ls07;->c:Le17;

    .line 30
    .line 31
    new-instance v1, Le17;

    .line 32
    .line 33
    const-string v2, "ScrollBy"

    .line 34
    .line 35
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 36
    .line 37
    .line 38
    sput-object v1, Ls07;->d:Le17;

    .line 39
    .line 40
    new-instance v1, Le17;

    .line 41
    .line 42
    const-string v2, "ScrollByOffset"

    .line 43
    .line 44
    invoke-direct {v1, v2}, Le17;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v1, Ls07;->e:Le17;

    .line 48
    .line 49
    new-instance v1, Le17;

    .line 50
    .line 51
    const-string v2, "ScrollToIndex"

    .line 52
    .line 53
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 54
    .line 55
    .line 56
    sput-object v1, Ls07;->f:Le17;

    .line 57
    .line 58
    new-instance v1, Le17;

    .line 59
    .line 60
    const-string v2, "OnAutofillText"

    .line 61
    .line 62
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 63
    .line 64
    .line 65
    sput-object v1, Ls07;->g:Le17;

    .line 66
    .line 67
    new-instance v1, Le17;

    .line 68
    .line 69
    const-string v2, "OnFillData"

    .line 70
    .line 71
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 72
    .line 73
    .line 74
    sput-object v1, Ls07;->h:Le17;

    .line 75
    .line 76
    new-instance v1, Le17;

    .line 77
    .line 78
    const-string v2, "SetProgress"

    .line 79
    .line 80
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 81
    .line 82
    .line 83
    sput-object v1, Ls07;->i:Le17;

    .line 84
    .line 85
    new-instance v1, Le17;

    .line 86
    .line 87
    const-string v2, "SetSelection"

    .line 88
    .line 89
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 90
    .line 91
    .line 92
    sput-object v1, Ls07;->j:Le17;

    .line 93
    .line 94
    new-instance v1, Le17;

    .line 95
    .line 96
    const-string v2, "SetText"

    .line 97
    .line 98
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 99
    .line 100
    .line 101
    sput-object v1, Ls07;->k:Le17;

    .line 102
    .line 103
    new-instance v1, Le17;

    .line 104
    .line 105
    const-string v2, "SetTextSubstitution"

    .line 106
    .line 107
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 108
    .line 109
    .line 110
    sput-object v1, Ls07;->l:Le17;

    .line 111
    .line 112
    new-instance v1, Le17;

    .line 113
    .line 114
    const-string v2, "ShowTextSubstitution"

    .line 115
    .line 116
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 117
    .line 118
    .line 119
    sput-object v1, Ls07;->m:Le17;

    .line 120
    .line 121
    new-instance v1, Le17;

    .line 122
    .line 123
    const-string v2, "ClearTextSubstitution"

    .line 124
    .line 125
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 126
    .line 127
    .line 128
    sput-object v1, Ls07;->n:Le17;

    .line 129
    .line 130
    new-instance v1, Le17;

    .line 131
    .line 132
    const-string v2, "InsertTextAtCursor"

    .line 133
    .line 134
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 135
    .line 136
    .line 137
    sput-object v1, Ls07;->o:Le17;

    .line 138
    .line 139
    new-instance v1, Le17;

    .line 140
    .line 141
    const-string v2, "PerformImeAction"

    .line 142
    .line 143
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 144
    .line 145
    .line 146
    sput-object v1, Ls07;->p:Le17;

    .line 147
    .line 148
    new-instance v1, Le17;

    .line 149
    .line 150
    const-string v2, "CopyText"

    .line 151
    .line 152
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 153
    .line 154
    .line 155
    sput-object v1, Ls07;->q:Le17;

    .line 156
    .line 157
    new-instance v1, Le17;

    .line 158
    .line 159
    const-string v2, "CutText"

    .line 160
    .line 161
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 162
    .line 163
    .line 164
    sput-object v1, Ls07;->r:Le17;

    .line 165
    .line 166
    new-instance v1, Le17;

    .line 167
    .line 168
    const-string v2, "PasteText"

    .line 169
    .line 170
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 171
    .line 172
    .line 173
    sput-object v1, Ls07;->s:Le17;

    .line 174
    .line 175
    new-instance v1, Le17;

    .line 176
    .line 177
    const-string v2, "Expand"

    .line 178
    .line 179
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 180
    .line 181
    .line 182
    sput-object v1, Ls07;->t:Le17;

    .line 183
    .line 184
    new-instance v1, Le17;

    .line 185
    .line 186
    const-string v2, "Collapse"

    .line 187
    .line 188
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 189
    .line 190
    .line 191
    sput-object v1, Ls07;->u:Le17;

    .line 192
    .line 193
    new-instance v1, Le17;

    .line 194
    .line 195
    const-string v2, "Dismiss"

    .line 196
    .line 197
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 198
    .line 199
    .line 200
    sput-object v1, Ls07;->v:Le17;

    .line 201
    .line 202
    new-instance v1, Le17;

    .line 203
    .line 204
    const-string v2, "RequestFocus"

    .line 205
    .line 206
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 207
    .line 208
    .line 209
    sput-object v1, Ls07;->w:Le17;

    .line 210
    .line 211
    new-instance v1, Lew6;

    .line 212
    .line 213
    const/16 v2, 0x8

    .line 214
    .line 215
    invoke-direct {v1, v2}, Lew6;-><init>(B)V

    .line 216
    .line 217
    .line 218
    new-instance v2, Le17;

    .line 219
    .line 220
    const-string v4, "CustomActions"

    .line 221
    .line 222
    invoke-direct {v2, v4, v3, v1}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 223
    .line 224
    .line 225
    sput-object v2, Ls07;->x:Le17;

    .line 226
    .line 227
    new-instance v1, Le17;

    .line 228
    .line 229
    const-string v2, "PageUp"

    .line 230
    .line 231
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 232
    .line 233
    .line 234
    sput-object v1, Ls07;->y:Le17;

    .line 235
    .line 236
    new-instance v1, Le17;

    .line 237
    .line 238
    const-string v2, "PageLeft"

    .line 239
    .line 240
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 241
    .line 242
    .line 243
    sput-object v1, Ls07;->z:Le17;

    .line 244
    .line 245
    new-instance v1, Le17;

    .line 246
    .line 247
    const-string v2, "PageDown"

    .line 248
    .line 249
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 250
    .line 251
    .line 252
    sput-object v1, Ls07;->A:Le17;

    .line 253
    .line 254
    new-instance v1, Le17;

    .line 255
    .line 256
    const-string v2, "PageRight"

    .line 257
    .line 258
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 259
    .line 260
    .line 261
    sput-object v1, Ls07;->B:Le17;

    .line 262
    .line 263
    new-instance v1, Le17;

    .line 264
    .line 265
    const-string v2, "GetScrollViewportLength"

    .line 266
    .line 267
    invoke-direct {v1, v2, v3, v0}, Le17;-><init>(Ljava/lang/String;ZLrn2;)V

    .line 268
    .line 269
    .line 270
    sput-object v1, Ls07;->C:Le17;

    .line 271
    .line 272
    return-void
.end method
